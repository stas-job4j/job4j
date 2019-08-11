package ru.job4j.oop.story2;

public class Story {
    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();

        hare.tryEat(kolobok);
        kolobok.roll();
        wolf.tryEat(kolobok);
        kolobok.roll();
        fox.tryEat(kolobok);
        fox.eat(kolobok);
        kolobok.theEnd(kolobok);
    }
}
