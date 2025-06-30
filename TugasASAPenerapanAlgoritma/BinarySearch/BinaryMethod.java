package BinarySearch;  // Mendefinisikan package tempat class ini berada

/**
 * Class BinaryMethod yang mengimplementasikan algoritma Binary Search
 * untuk mencari elemen dalam array terurut
 */
public class BinaryMethod {
    
    /**
     * Metode untuk melakukan pencarian dengan algoritma Binary Search
     * 
     * @param arr array terurut yang akan dicari
     * @param x nilai target yang dicari
     * @return indeks dari target jika ditemukan, -1 jika tidak ditemukan
     */
    public static int binarySearch(int[] arr, int x) {
        //Menginisialisasi batas kiri pencarian
        int left = 0;
        
        //Menginisialisasi batas kanan pencarian (indeks terakhir array)
        int right = arr.length - 1;
        
        //Melakukan pencarian selama batas kiri tidak melebihi batas kanan
        while (left <= right) {
            //Menemukan indeks tengah dari range pencarian saat ini
            //Rumus (left + right) / 2 dapat menyebabkan integer overflow pada array besar
            //sehingga digunakan rumus left + (right - left) / 2 yang lebih aman
            int mid = left + (right - left) / 2;
            
            //Jika elemen tengah sama dengan target, kembalikan indeksnya
            if (arr[mid] == x) {
                return mid;
            } 
            //Jika elemen tengah lebih kecil dari target, cari di bagian kanan (nilai lebih besar)
            else if (arr[mid] < x) {
                left = mid + 1;
            } 
            //Jika elemen tengah lebih besar dari target, cari di bagian kiri (nilai lebih kecil)
            else {
                right = mid - 1;
            }
        }
        
        //Jika target tidak ditemukan setelah pencarian selesai, kembalikan -1
        return -1;
    }
}