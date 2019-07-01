package ru.job4j.condition;

/**
 * @author Stanislau S. (saydobenothing@gmail.com)
 * @version $1.0$
 * @since 30.06.2019
 */
public class Max {
    /**
     * Метод ,который возвращает большее из 2 чисел.
     *
     * @param left,right - первое и второе число.
     * @return result = Max (большее из двух чисел).
     */
    public int max(int left, int right) {
            return left <= right ? right : left;
        }
    }