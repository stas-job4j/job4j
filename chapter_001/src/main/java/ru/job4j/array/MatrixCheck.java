package ru.job4j.array;

/**
 * @author Sinkevich Stanislau (saydobenothing@gmail.com)
 * @version $1.0$
 * @since 08.07.2019
 */
public class MatrixCheck {
    /**
     * Method mono
     * @param data массив состоящий из boolean значений.
     * @return при равенстве элементов по диагоналям возвращает true , иначе false.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        // при движении по диагонали с левого верхнего края ([0][0]) i=j , сравниваем первый элемент с остальными
        // если они не равны , останавливаем цикл и возвращаем false
        for (int i = 0; i < data.length; i++) {
            if (data[0][0] != data[i][i]) {
                result = false;
                break;
            }
        }
        // при движении по диагонали с правого верхнего края ([0][массив.длина-1] ) i уведичивается,а  j уменьшается
        // сравниваем первый элемент с остальными ,если они не равны , останавливаем цикл и возвращаем false
        for (int i = 0, j = data.length - 1; i < data.length; i++, j--) {
            if (data[0][data.length - 1] != data[i][j]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
