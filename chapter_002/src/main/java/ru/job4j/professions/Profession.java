package ru.job4j.professions;
/**
 * @author Stanislau Sinkevich (saydobenothing@gmail.com)
 * @version $1.0$
 * @since 11.08.2019
 */

/**
 * Супер класс !
 */
public class Profession {
    private String name;
    private String surname;
    private String education;
    private int age;

    /**
     * Конструктор суперкласса
     * @param name
     * @param surname
     * @param education
     * @param age
     */
    Profession(String name, String surname, String education, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.education = education;
    }
    /**
     * Методы,возвращающие поля (к private полям напрямую обращаться нельзя)
     * @param name,surname,education,age
     * @return name,surname,education,age
     */
    public String getName(String name) {
        return name;
    }
    public String getSurname(String surname) {
        return surname;
    }
    public String getEducation(String education) {
        return education;
    }
    public int getName(int age) {
        return age;
    }

    /**
     * Получает зарплату
     */
    public void getSalary() { }

    /**
     * Работает,создает что-либо
     */
    public void work() { }
}

