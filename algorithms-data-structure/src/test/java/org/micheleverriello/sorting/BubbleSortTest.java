package org.micheleverriello.sorting;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTest {

    static int[] array;

    @BeforeAll
    static void setup() {
        //filling up array
        array = new int[]{6, 5, 4, 3, 7, -1, 11, -22, 100};
    }

    @Test
    public void sort() {
        int[] result = BubbleSort.sort(array);
        int[] expectedResult = new int[]{-22, -1, 3, 4, 5, 6, 7, 11, 100};

        assertArrayEquals(expectedResult, result);
    }
}
