package ru.job4j.testovoezadanie;

/**
 * @author Stanislau Sinkevich (saydobenothing@gmail.com)
 * @version $1.0$
 * @since 28.07.2019
 */
public class Array {
    /**
     * Метод , суммирующий 2 отсортированных массива в 1 , используя сортировку слиянием
     * т.е. явной сортировки нет,массив заполняется элементами из двух массивов от меньшего к большему
     * @param left (один отсортированный массив)
     * @param right (второй отсортированный массив)
     * @return array (суммарный отсортированный массив)
     */
    public int[] merge(int[] left, int[] right) {
        int[] array = new int[left.length + right.length];
        int indexL = 0, indexR = 0, i = 0;
        while (i < array.length){
            if (indexL == left.length){
                array[i] = right[indexR++];
            } else if (indexR == right.length){
                array[i] = left[indexL++];
            } else {
                array[i] = left[indexL] < right[indexR] ? left[indexL++] : right[indexR++];
            }
            i++;
        }
        return array;
    }

    public int[] mergeSecond(int[] left, int[] right) {
        int[] array = new int[left.length + right.length];
        int indexL = 0, indexR = 0;
        for (int index = 0; index < array.length; index++) {
            if (indexL == left.length) {
                array[index] = right[indexR++];
            } else if (indexR == right.length) {
                array[index] = left[indexL++];
            } else {
                array[index] = left[indexL] < right[indexR] ? left[indexL++] : right[indexR++];
            }
        }
        return array;
    }
}