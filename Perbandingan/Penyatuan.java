package Perbandingan;

/**
 * Kelas Penyatuan berisi implementasi algoritma Binary Search dan Jump Search
 */
public class Penyatuan {
    // 🔹 Binary Search Method
    public static int binarySearch(int[] arr, int nilai) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == nilai) return mid;
            if (arr[mid] < nilai) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    // 🔹 Jump Search Method
    public static int jumpSearch(int[] arr, int nilai) {
        int n = arr.length;
        int step = (int) Math.sqrt(n);
        int prev = 0;

        while (prev < n && arr[Math.min(step, n) - 1] < nilai) {
            prev = step;
            step += (int) Math.sqrt(n);
            if (prev >= n) return -1; // Jika nilai tidak ditemukan
        }

        while (prev < n && arr[prev] < nilai) {
            prev++;
            if (prev == Math.min(step, n)) return -1;
        }

        return (prev < n && arr[prev] == nilai) ? prev : -1;
    }
}
