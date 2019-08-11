package ru.job4j.professions;

public class Dentist extends Doctor {

    /**
     * Конструктор класса Дантист
     * @param workAtHospital
     * @param name
     * @param surname
     * @param education
     * @param age
     */
    public Dentist(boolean workAtHospital, String name, String surname, String education, int age) {
        super(workAtHospital, name, surname, education, age);
    }

    /**
     * Проверяет зубы
     */
    public void treatTooth(Patient patient) { }
}

