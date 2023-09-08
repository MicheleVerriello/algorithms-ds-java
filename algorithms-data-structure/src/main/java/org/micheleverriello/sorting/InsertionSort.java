package org.micheleverriello.sorting;

public class InsertionSort {

    public static int[] insertionSort(int[] array) {

        int size = array.length;

        for (int i = 1; i < size; i++) {
            int tmp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > tmp) {
                array[j + 1] = array[j];
                j--;
            }

            array[j+1] = tmp;
        }

        return array;
    }
}
