package ru.job4j.construktor;

public class Animal {
    public Animal(String name) {
        super();
        System.out.println("Animal");
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Plov");
        Predator predator = new Predator("Kit");
        Tiger tiger = new Tiger("JoJo");
    }
}
