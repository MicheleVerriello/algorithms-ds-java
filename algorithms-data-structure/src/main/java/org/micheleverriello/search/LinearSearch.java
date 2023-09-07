package org.micheleverriello.search;

import org.micheleverriello.models.ListNode;

public class LinearSearch {

    /**
     * Linear Search applied on a simple array
     *
     * This algorithm returns the first occurence of the found element,
     * if you want the last, simply slide from size to zero
     *
     * @param array the given array
     * @param searchValue the value to find
     * @return the position of the element if found, else -1
     */
    public static int linearSearch(int[] array, int searchValue) {
        int size = array.length;
        int elementPosition = -1;

        for(int i = 0; i < size; i ++) {
            if(array[i] == searchValue) {
                elementPosition = i;
                break;
            }
        }

        return elementPosition;
    }

    /**
     * Linear search applied on a linked list
     *
     * @param head the start of the linked list
     * @param searchValue the value to find
     * @return the ListNode element with the value found if found, null else
     */
    public static ListNode linearSearch(ListNode head, int searchValue) {
        ListNode searchedElement = null;
        ListNode pivotingElement = head;

        while(pivotingElement != null) {

            if(pivotingElement.getVal() == searchValue) {
                searchedElement = pivotingElement;
                break;
            } else {
                pivotingElement = pivotingElement.getNext(); //if next is null, the loop will stop on the next while
            }
        }

        return searchedElement;
    }
}
