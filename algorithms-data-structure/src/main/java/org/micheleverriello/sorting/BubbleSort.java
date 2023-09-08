package org.micheleverriello.sorting;

public class BubbleSort {
    public static int[] sort(int[] array) {

        int size = array.length;
        boolean swap = true;

        while(swap) {
            swap = false;
            for (int i = 0; i < size - 1; i++) {
                if(array[i] > array[i + 1]) {
                    swap = true;
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        }

        return array;
    }
}
