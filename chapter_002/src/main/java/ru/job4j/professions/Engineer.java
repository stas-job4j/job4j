package ru.job4j.professions;

public class Engineer extends Profession {
    boolean canDoEverything;
    boolean haveSuperPower;

    /**
     * Конструктор класса Инженер
     * @param canDoEverything
     * @param haveSuperPower
     * @param name
     * @param surname
     * @param education
     * @param age
     */
    public Engineer(boolean canDoEverything, boolean haveSuperPower, String name, String surname, String education, int age) {
        super(name, surname, education, age);
    }

    /**
     * Создает что-то
     */
    public void create() { }
}
