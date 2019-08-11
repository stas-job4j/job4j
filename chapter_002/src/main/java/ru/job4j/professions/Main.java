package ru.job4j.professions;

/**
 * @author Stanislau Sinkevich (saydobenothing@gmail.com)
 * @version $1.0$
 * @since 11.08.2019
 */
public class Main {

    /**
     * Точка входа в программу
     * @param args
     */
    public static void main(String[] args) {

        /**
         * Создаем по одному представителю профессий,а так же пациента и заказчика
         */
        Programmer programmer = new Programmer(true, true, true, "Stas", "Sinkevich", "higher ed.", 24);
        Builder builder = new Builder(true, false, false, "Sasha", "Petrov", "secondary ed.", 27);
        Customer customer = new Customer("EPAM");
        Dentist dentist = new Dentist(false, "Leo", "Komarov", "higher ed.", 43);
        Surgeon surgeon = new Surgeon(true, true, "Petya", "Saharov", "higher ed.", 29);
        Patient patient = new Patient(false);

        /**
         * Реализуем минимальное взаимодействие между объектами классов
         */
        patient.goToTheDoctor(dentist);
        dentist.treatTooth(patient);
        dentist.giveAdvice(patient);
        patient.goToTheDoctor(surgeon);
        surgeon.treatPatient(patient);
        surgeon.doSurgery(patient);
        surgeon.getSalary();
        patient.isHealthy = true;
        customer.makeAnOrder(programmer);
        programmer.create();
        programmer.makeSite();
        customer.makeAnOrder(builder);
        builder.drinkAlcohol = false;
        builder.create();
        builder.isBuilding();
        builder.getSalary();
        builder.drinkAlcohol = true;
    }
}
