package org.micheleverriello.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.micheleverriello.models.ListNode;

public class BinarySearchTest {

    static int[] array;
    static ListNode head;
    static ListNode node4;

    @BeforeAll
    static void setup() {
        //filling up array
        array = new int[]{1, 2, 4, 22, 23, 24, 90, 100};

        //filling up linked list
        ListNode node = new ListNode(3);
        ListNode node2 = new ListNode(5, node);
        ListNode node3 = new ListNode(9, node2);
        node4 = new ListNode(-1, node3);
        head = new ListNode(-5, node4);
    }

    @Test
    public void binarySearchArray() {
        int index = BinarySearch.binarySearch(array, 24);
        Assertions.assertEquals(5, index);
    }

    @Test
    public void binarySearchArrayNotFoundValue() {
        int index = BinarySearch.binarySearch(array, 111);
        Assertions.assertEquals(-1, index);
    }

    @Test
    public void binarySearchArrayApproxRight() {
        int index = BinarySearch.binarySearchApprox(array, 111);
        Assertions.assertEquals(array.length, index);
    }

    @Test
    public void binarySearchArrayApproxLeft() {
        int index = BinarySearch.binarySearchApprox(array, 0);
        Assertions.assertEquals(0, index);
    }

    @Test
    public void binarySearchArrayApproxCenter() {
        int index = BinarySearch.binarySearchApprox(array, 26);
        Assertions.assertEquals(6, index);
    }
}
