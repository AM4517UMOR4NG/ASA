package BinarySearch;
/**
 * BinaryData.java
 * 
 * Kelas ini menyediakan data array yang sudah terurut.
 * Data ini akan digunakan sebagai input pada metode Binary Search.
 */
public class BinaryData {
    public static int[] getData() {
        // Pastikan array terurut agar Binary Search bekerja dengan benar
        return new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
    }
}
