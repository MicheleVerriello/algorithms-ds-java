package org.micheleverriello.sorting;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {
    static int[] array;

    @BeforeAll
    static void setup() {
        //filling up array
        array = new int[]{4, 7, 4, 22, 23, -1, -22, 100};
    }

    @Test
    public void sort() {
        int[] result = MergeSort.sort(array);
        int[] expectedResult = new int[]{-22, -1, 4, 4, 7, 22, 23, 100};

        assertArrayEquals(expectedResult, result);
    }
}
