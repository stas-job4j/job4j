package ru.job4j.testovoezadanie;

public class Array {
    public int[] merge(int[] left, int[] right) {
        int[] array = new int[left.length + right.length];
        int indexL = 0, indexR = 0;
        for (int index = 0; index < array.length; index++) {
            if (indexL == left.length) {
                array[index] = right[indexR];
                indexR++;
            } else if (indexR == right.length) {
                array[index] = left[indexL];
                indexL++;

            } else if (left[indexL] < right[indexR]) {
                array[index] = left[indexL];
                indexL++;

            } else {
                array[index] = right[indexR];
                indexR++;
            }
        }
        return array;
    }
}