package ru.job4j.calculator;

/**
 *Class Calculator . Решение задачи 3.1. Элементарный калькулятор.[#152387]
 *@author Stanislau S. (saydobenothing@gmail.com)
 *@since 29.06.2018
 */
public class Calculator {

    /**
     * Method add.
     * @param first,second .
     * @return first plus second.
     */
    public double add(double first, double second) {
        return first + second;
    }
    /**
     * Method substract.
     * @param first,second .
     * @return first minus second.
     */
    public double substract(double first, double second) {
        return first - second;
    }
    /**
     * Method divide.
     * @param first,second .
     * @return first divide by second.
     */
    public double div(double first, double second) {
        return first / second;
    }
    /**
     * Method multiple.
     * @param first,second .
     * @return first multiple by second.
     */
    public double multiple(double first, double second) {
        return first * second;
    }
}