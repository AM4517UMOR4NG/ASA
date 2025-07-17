package KumpulanAlgoritma.Bubble.BubbleSort;

// === Algorithm Classes ===

/**
 * Algorithm class for Bubble Sort.
 */
public class BubbleSortAlgorithm {
    /**
     * Sorts the array in the given BubbleSortAttribute in ascending order using
     * Bubble Sort.
     * Time Complexity: O(n^2), Space Complexity: O(1)
     * 
     * @param attr The BubbleSortAttribute containing the array to sort
     */
    public static void sort(BubbleSortAttribute attr) {
        int[] arr = attr.getArray();
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}