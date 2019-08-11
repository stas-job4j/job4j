package ru.job4j.professions;

public class Programmer extends Engineer {
    boolean selfTaught;

    /**
     * Конструктор класса Программист
     * @param selfTaught
     * @param canDoEverything
     * @param haveSuperPower
     * @param name
     * @param surname
     * @param education
     * @param age
     */
    public Programmer(boolean selfTaught, boolean canDoEverything, boolean haveSuperPower, String name, String surname, String education, int age) {
        super(canDoEverything, haveSuperPower, name, surname, education, age);
    }

    public void makeSite() {
        /**
         * Создает простой сайт
         */
    }

    public void create() {
        super.create();
        /**
         * Создает простую программу
         */
    }
}
