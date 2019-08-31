package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Date;

/**
 * @author Sinkevich Stanislau (saydobenothing@gmail.com)
 * @version $ 1.0 $
 * @since 16.08.2019(to 31.08.2019)
 */
public class Tracker {

    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        return new Date().toString() + Math.random();
    }

    /**
     * Метод заменяет ячейку в массиве this.Items
     * @param id
     * @param item
     * @return boolean результат удалось ли провести операцию
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int index = 0; index != this.position; index++) {
            if (this.items[index] != null && this.items[index].getId().equals(id)) {
                this.items[index] = item;
                this.items[index].setId(id);
                result = true;
                break;
            }
        }
        return result;
    }


    /**
     * Метод проверяет в цикле все элементы массива this.items, сравнивая id с аргументом String id
     * @param id
     * @return  найденный Item , сли Item не найден - возвращает null.
     */
    public Item findById(String id) {
        Item result = null;
        for (int index = 0; index != this.position; index++) {
            if (this.items[index] != null && items[index].getId().equals(id)) {
                result = items[index];
                break;
            }
        }
        return result;
    }

    /**
     * Метод роверяет в цикле все элементы массива this.items,
     * сравнивая name (используя метод getName класса Item) с аргументом метода String key
     * @param name
     * @return массив элементов с одинаковым названием (String name)
     */
    public Item[] findByName(String name) {
        Item[] items = new Item[position];
        int count = 0;
        for (int index = 0; index < position; index++) {
            if (this.items[index] != null && this.items[index].getName().equals(name)) {
                items[count++] = this.items[index];
            }
        }
        return Arrays.copyOf(items, count);
    }

    /**
     * Метод удаляет ячейку (массив[индекс] = null ) в массиве this.item
     * @param id
     * @return boolean значение получилось ли удалить ячейку в массиве this.items
     */
    public boolean delete(String id) {
        boolean result = false;
        for (int index = 0; index != this.position; index++) {
            if (this.items[index] != null && this.items[index].getId().equals(id)) {
                this.items[index] = null;
                System.arraycopy(items, index + 1, items, index, this.position - index - 1);
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Метод возвращает копию массива this.items без null элементов
     * @return массив без null элементов
     */
    public Item[] findAll() {
        Item[] result = new Item[this.position];
        for (int index = 0; index != this.position; index++) {
            if (this.items[index] != null) {
                result[index] = this.items[index];
            }
        }
        return result;
    }
}