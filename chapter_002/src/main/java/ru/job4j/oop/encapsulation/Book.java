package ru.job4j.oop.encapsulation;

/**
 * @author Sinkevich Stanislau Yurievich (saydobenothing@gmail.com)
 * @since 31.08.2019
 */
public class Book {
    private String title;
    private int numberOfPages;

    public Book(String title, int numberOfPages) {
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
