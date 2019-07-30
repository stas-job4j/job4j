package ru.job4j.refactor;

/**
 * @author Stanislau Sinkevich (saydobenothing@gmail.com)
 * @version $1.0$
 * @since 30.07.2019
 */
public class Max {
    /**
     * Метод ,который возвращает большее из 2 чисел.
     *
     * @param first,second - первое и второе число.
     * @return  Max (большее из двух чисел).
     */
    public int max(int first, int second) {
        return first <= second ? second : first;
    }
    /**
     * Метод ,который возвращает большее из 3 чисел.
     *
     * @param first,second,third - первое ,второе число и третье число.
     * @return  Max (большее из трех чисел).
     */
    public int max(int first, int second, int third) {
        return max(third,
                max(first, second)
        );

    }
    /**
     * Метод ,который возвращает большее из 4 чисел.
     *
     * @param first,second,third,fourth - первое ,второе число, третье и четвертое число.
     * @return  Max (большее из четырех чисел).
     */
    public int max(int first, int second, int third, int fourth) {
        return max(fourth,
                max(first, second,third)
        );

    }
}