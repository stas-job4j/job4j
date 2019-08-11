package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int value) {
        this.load = value;
    }
    void exchange(Battery another) {
        this.load = this.load - another.load;
        another.load *= 2;
    }

    public static void main(String[] args) {
        Battery first = new Battery(45);
        Battery second = new Battery(30);
        System.out.println("first : " + first.load + " , second : " + second.load);
        first.exchange(second);
        System.out.println("first : " + first.load + " , second : " + second.load);
    }
}
