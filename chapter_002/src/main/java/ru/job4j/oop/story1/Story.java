package ru.job4j.oop.story1;

public class Story {
    public static void main(String[] args) {
        Pioneer petya = new Pioneer();
        Wolf scar = new Wolf();
        Girl masha = new Girl();

        masha.help(petya);
        scar.eat(masha);
        petya.kill(scar);
    }
}
