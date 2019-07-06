package ru.job4j.array;

/**
 * @author Sinkevich Stanislau (saydobenothing@gmail.com)
 * @version $1.0$
 * @since 06.07.2019
 */
public class Turn {
    /**
     * Method back.
     * @param array массив чисел.
     * @return массив с обратной постановкой элементов.
     */
    public int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int temp = array[index];
            array[index] = array[array.length - 1 - index];
            array[array.length - index - 1] = temp;
        }
    return array;
    }
}
