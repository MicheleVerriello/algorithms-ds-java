package org.micheleverriello.sorting;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InsertionSortTest {

    static int[] array;

    @BeforeAll
    static void setup() {
        //filling up array
        array = new int[]{6, 5, 4, 3, 7};
    }

    @Test
    public void selectionSort() {
        int[] result = InsertionSort.insertionSort(array);
        int[] expectedResult = new int[]{3, 4, 5, 6, 7};

        assertArrayEquals(expectedResult, result);
    }
}
