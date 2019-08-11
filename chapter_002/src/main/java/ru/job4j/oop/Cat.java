package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public String sound() {
        return "may may";
    }
    public void show() {
        System.out.println(this.name + " eat " + this.food);
    }
    public void eat(String meat) {
        this.food = meat;
    }
    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        String say = peppy.sound();
        System.out.println("Peppy says " + say);
        Cat gav = new Cat();
        Cat black = new Cat();
        System.out.println("There are gav's food");
        gav.eat("kotleta");
        gav.giveNick("Gav");
        gav.show();
        System.out.println("There are black's food");
        black.eat("ryba");
        black.giveNick("Black");
        black.show();
    }
}
