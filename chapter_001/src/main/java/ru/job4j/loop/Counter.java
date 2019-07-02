package ru.job4j.loop;
/**
 *Class Caunter . Решение задачи 5.1. Подсчет суммы чётных чисел в диапазоне[#152364]
 *@author Stanislau S. (saydobenothing@gmail.com)
 *@since 02.07.2019
 */
public class Counter {
    /**
     * Method add.
     * @param start,finish .
     * @return sum ( сумма всех четных числе в диапазоне от start до finish ).
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int number = start; number <= finish; number++) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }
}