package ru.job4j.oop;

public class DummyDic {

    public  String engToRus(String eng) {
        return "Неизвестное слово " + eng;
    }

    public static void main(String[] args) {
        DummyDic dum = new DummyDic();
        String translate = dum.engToRus("Panzer");
        System.out.println(translate);
    }
}

