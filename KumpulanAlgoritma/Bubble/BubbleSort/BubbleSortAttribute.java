package KumpulanAlgoritma.Bubble.BubbleSort;

// === Attribute Classes ===

/**
 * Attribute class for Bubble Sort, holding the array to be sorted.
 */
public class BubbleSortAttribute {
    private int[] array;

    public BubbleSortAttribute(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}