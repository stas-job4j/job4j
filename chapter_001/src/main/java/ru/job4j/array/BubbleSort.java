package ru.job4j.array;

/**
 * @author Sinkevich Stanislau (saydobenothing@gmail.com)
 * @version $1.0$
 * @since 07.07.2019
 */
public class BubbleSort {
    /**
     * Method sort (сортировка массива методом пузырька)
     * @param array (массив чисел)
     * @return отсортированный массив array
     */
    public int[] sort(int[] array) {
        for (int right = 0; right < array.length; right++) {
            int tempR = array[right];
            for (int left = right - 1; left >= 0; left--) {
                int tempL = array[left];
                if (tempR < tempL) {
                    array[left + 1] = tempL;
                    array[left] = tempR;
                }
            }
        }
        return array;
    }
}
