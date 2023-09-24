package org.micheleverriello.sorting;

public class MergeSort {

    public static int[] sort(int[] array) {

        int size = array.length;

        if(size < 2) {
            return array;
        }

        int midIndex = size / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[size - midIndex];

        System.arraycopy(array, 0, leftHalf, 0, midIndex);
        System.arraycopy(array, midIndex, rightHalf, 0, rightHalf.length);

        sort(leftHalf);
        sort(rightHalf);

        merge(array, leftHalf, rightHalf);

        return array;
    }

    private static void merge(int[] array, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                array[k] = leftHalf[i];
                i++;
            } else {
                array[k] = rightHalf[j];
                j++;
            }

            k++;
        }

        // add remaining elements
        while (i < leftSize) {
            array[k] = leftHalf[i];
            i++; k++;
        }

        while (j < rightSize) {
            array[k] = rightHalf[j];
            j++; k++;
        }
    }
}
