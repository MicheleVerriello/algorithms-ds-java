package org.micheleverriello.sorting;

public class QuickSort {

    public static int[] sort(int[] array, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) {
            return array;
        }

        int pivot = array[highIndex];

        //partitioning step
        int leftPointer = partition(array, lowIndex, highIndex, pivot);

        sort(array, lowIndex, leftPointer - 1);
        sort(array, leftPointer + 1, highIndex);

        return array;
    }

    private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex - 1;

        while (leftPointer < rightPointer) {

            // Walk from the left until we find a number greater than the pivot, or hit the right pointer.
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            // Walk from the right until we find a number less than the pivot, or hit the left pointer.
            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
        }


        if(array[leftPointer] > array[highIndex]) {
            swap(array, leftPointer, highIndex);
        }
        else {
            leftPointer = highIndex;
        }

        return leftPointer;
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
