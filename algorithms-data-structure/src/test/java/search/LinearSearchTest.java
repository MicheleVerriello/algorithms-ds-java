package search;

import models.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class LinearSearchTest {

    static int[] array;
    static ListNode head;
    static ListNode node4;

    @BeforeAll
    static void setup() {
        //filling up array
        array = new int[]{11, 55, 3, 1, 5, 7, 8, 100};

        //filling up linked list
        ListNode node = new ListNode(3);
        ListNode node2 = new ListNode(5, node);
        ListNode node3 = new ListNode(9, node2);
        node4 = new ListNode(-1, node3);
        head = new ListNode(-5, node4);
    }

    @Test
    public void linearSearchArray() {
        int index = LinearSearch.linearSearch(array, 7);
        Assertions.assertEquals(5, index);
    }

    @Test
    public void linearSearchArrayNotFoundValue() {
        int index = LinearSearch.linearSearch(array, 111);
        Assertions.assertEquals(-1, index);
    }

    @Test
    public void linearSearchLinkedList() {
        ListNode result = LinearSearch.linearSearch(head, -1);
        Assertions.assertEquals(node4, result);
    }

    @Test
    public void linearSearchLinkedListNotFoundValue() {
        ListNode result = LinearSearch.linearSearch(head, -11);
        Assertions.assertNull(result);
    }
}
