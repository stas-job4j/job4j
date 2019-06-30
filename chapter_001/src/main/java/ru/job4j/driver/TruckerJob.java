package ru.job4j.driver;

public class TruckerJob {
    public static void main(String[] args) {
        Driver steve = new Driver();
        System.out.println("Steve wants the trucker job.");
        if (!steve.hasLicense()) {
            System.out.println("Steve needs to get a license!");
        }
        if (steve.canDrive('C')) {
            System.out.println("Steve works on truckers");
        } else if (steve.canDrive('B')) {
            System.out.println("Steve works in taxi.");
        } else {
            System.out.println("Steve does not have a job , but ride on motobike!");
        }
    }
}
