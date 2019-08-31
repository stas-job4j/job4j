package ru.job4j.oop.encapsulation;

/**
 * @author Sinkevich Stanislau Yurievich (saydobenothing@gmail.com)
 * @since 31.08.2019
 */
public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Senya");
        student.setSurname("Karchevski");
        student.setPatronymic("Vitoldovich");
        student.setGroup(130912);
        student.setYearOfReceipt(2013);
        System.out.println("Студент " + student.getName() + " " + student.getSurname() + " " + student.getPatronymic() + " , поступил в " + student.getYearOfReceipt() + " году в БНТУ , группа номер " + student.getGroup());
    }
}
