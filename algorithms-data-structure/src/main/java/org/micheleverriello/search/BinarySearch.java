package org.micheleverriello.search;


import org.micheleverriello.models.ListNode;

public class BinarySearch {

    /**
     * Binary Search applied on a simple sorted array
     *
     * @param array the given sorted array
     * @param searchValue the value to find
     * @return the position of the element if found, else -1
     */
    public static int binarySearch(int[] array, int searchValue) {

        int left = 0;
        int right = array.length - 1;
        int chosen = (left + right) / 2;

        while (left <= right) {
            if (array[chosen] == searchValue) {
                return chosen;
            } else if (array[chosen] < searchValue) {
                left = chosen + 1;
            } else {
                right = chosen - 1;
            }

            chosen = (right + left) / 2;
        }

        return -1;
    }

    /**
     * Binary Search applied on a simple sorted array
     * If the element is not found, it will return the nearest
     *
     * @param array the given sorted array
     * @param searchValue the value to find
     * @return the position of the element if found, else -1
     */
    public static int binarySearchApprox(int[] array, int searchValue) {

        int left = 0;
        int right = array.length - 1;
        int chosen = (left + right) / 2;

        while (left <= right) {
            if (array[chosen] == searchValue) {
                return chosen;
            } else if (array[chosen] < searchValue) {
                left = chosen + 1;
            } else {
                right = chosen - 1;
            }
            chosen = (right + left) / 2;
        }

        return left;
    }

    /**
     * Linear search applied on a sorted linked list
     *
     * @param head the start of the sorted linked list
     * @param searchValue the value to find
     * @return the ListNode element with the value found if found, null else
     */
    public ListNode binarySearch(ListNode head, int searchValue) {
        return null;
    }
}
