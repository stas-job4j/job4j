package ru.job4j.loop;
/**
 *Class Factorial . Решение задачи 5.2. Создать программу, вычисляющую факториал.[#152365]
 *@author Stanislau S. (saydobenothing@gmail.com)
 *@since 03.07.2019
 */
public class Factorial {
    /**
     * Method calc.
     * @param n .
     * @return result( факториал чисел в диапазоне от 1 до n или единицу при n=0 ).
     */
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
