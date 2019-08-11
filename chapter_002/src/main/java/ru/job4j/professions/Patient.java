package ru.job4j.professions;

public class Patient {
    boolean isHealthy;

    /**
     * Конструктор класса Пациент
     * @param isHealthy
     */
    public Patient(boolean isHealthy) {
        this.isHealthy = isHealthy;
    }

    /**
     * Идет к доктору
     */
    public void goToTheDoctor(Doctor another) { }
}
