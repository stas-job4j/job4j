package ru.job4j.oop.encapsulation;

/**
 * @author Sinkevich Stanislau Yurievich (saydobenothing@gmail.com)
 * @since 31.08.2019
 */
public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Джедайские техники", 363);
        Book book2 = new Book("Чистый код", 780);
        Book book3 = new Book("1984", 320);
        Book book4 = new Book("Программист фанатик", 432);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        // Правильный вариант записи цикла for по мнению Идеи
        for (Book bk : books) {
            System.out.println("Название книги : " + bk.getTitle() + " ,количество страниц - " + bk.getNumberOfPages());
        }
        System.out.println("Swap 1st and 3d books");
        books[0] = book3;
        books[2] = book1;

        // Неправильный цикл for по мению Идеи , из-за него стоит желтый квадратик

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println("Название книги : " + bk.getTitle() + " ,количество страниц - " + bk.getNumberOfPages());
        }
        System.out.println("Цикл с выводом книг Чистый код");
        for (Book bk : books) {
            if (bk.getTitle().equals("Чистый код")) {
                System.out.println("Название книги : " + bk.getTitle() + " ,количество страниц - " + bk.getNumberOfPages());
            }
        }
    }
}
