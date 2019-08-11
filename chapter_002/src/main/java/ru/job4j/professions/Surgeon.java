package ru.job4j.professions;

public class Surgeon extends Doctor {
    boolean hasKnife;

    /**
     * Конструктор класса Хирург
     * @param hasKnife
     * @param workAtHospital
     * @param name
     * @param surname
     * @param education
     * @param age
     */
    public Surgeon(boolean hasKnife, boolean workAtHospital, String name, String surname, String education, int age) {
        super(workAtHospital, name, surname, education, age);
    }

    public void doSurgery(Patient patient) {
        /**
         * Оперирует пациента
         */
    }
}
