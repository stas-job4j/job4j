package ru.job4j.oop.encapsulation;

/**
 * @author Sinkevich Stanislau Yurievich (saydobenothing@gmail.com)
 * @since 31.08.2019
 */
public class Student {
    private String name;
    private String surname;
    private String patronymic;
    private int group;
    private int yearOfReceipt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getYearOfReceipt() {
        return yearOfReceipt;
    }

    public void setYearOfReceipt(int yearOfReceipt) {
        this.yearOfReceipt = yearOfReceipt;
    }
}
