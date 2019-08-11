package ru.job4j.professions;

public class Doctor extends Profession {
    boolean workAtHospital;

    /**
     * Конструктор класса Доктор
     * @param workAtHospital
     * @param name
     * @param surname
     * @param education
     * @param age
     */
    public Doctor(boolean workAtHospital, String name, String surname, String education, int age) {
        super(name, surname, education, age);
    }
    /**
     * Проводит проверку
     */
    public void treatPatient(Patient another) { }

    /**
     * Дает простой совет
     */
    public void giveAdvice(Patient another) { }
}
