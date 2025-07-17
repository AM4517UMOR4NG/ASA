package KumpulanAlgoritma.Bubble.BubbleSort;

import java.util.Arrays;

/**
 * Main class to demonstrate Bubble Sort.
 */
public class BubbleSortMain {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90

};
        BubbleSortAttribute attr = new BubbleSortAttribute(array);
        BubbleSortAlgorithm.sort(attr);
        System.out.print("Sorted array using Bubble Sort: ");
        System.out.println(Arrays.toString(attr.getArray()));
    }
}