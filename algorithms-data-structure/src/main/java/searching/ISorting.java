package searching;

public interface ISorting {
    public int[] selectionSort(int[] source);

    public int[] insertionSort(int[] source);

    public int[] bubbleSort(int[] source);

    public int[] mergeSort(int[] source);

    public int[] quickSort(int[] source);
}
