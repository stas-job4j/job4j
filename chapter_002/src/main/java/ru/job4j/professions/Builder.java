package ru.job4j.professions;

public class Builder extends Engineer {
    boolean drinkAlcohol;

    /**
     * Конструктор класса Строитель
     * @param drinkAlcohol
     * @param canDoEverything
     * @param haveSuperPower
     * @param name
     * @param surname
     * @param education
     * @param age
     */
    public Builder(boolean drinkAlcohol, boolean canDoEverything, boolean haveSuperPower, String name, String surname, String education, int age) {
        super(canDoEverything, haveSuperPower, name, surname, education, age);
    }

    /**
     * Работает на стройке
     */
    public void isBuilding() { }

    /**
     * Создает чертижи для дальнейшего строительства
     */
    public void create() {
        super.create();
    }
}
