package ru.job4j.condition;
/**
 * @author Stanislau S. (saydobenothing@gmail.com)
 * @version $1.0$
 * @since 01.07.2019
 */
public class MultiMax {
    /**
     * Метод ,который возвращает большее из 3 чисел.
     *
     * @param first,second,third - первое , второе и третье число соответственно.
     * @return result = Max (большее из трех чисел).
     */
    public int max(int first, int second, int third) {
    int result = first >= second ? first : second;
    return result >= third ? result : third;
    }
}
