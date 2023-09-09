package org.micheleverriello.sorting;

public class SelectionSort {

    public static int[] sort(int[] array) {

        int size = array.length;

        for (int i = 0; i < size - 1; i++) {
            for(int j = i + 1; j < size; j ++) {
                if(array[j] < array[i]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }

        return array;
    }
}
