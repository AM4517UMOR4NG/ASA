package JumpSearch;  // Mendefinisikan package tempat class ini berada

/**
 * Class JumpSearchMethod yang mengimplementasikan algoritma Jump Search
 * untuk mencari elemen dalam array terurut
 */
public class JumpSearchMethod {
    
    /**
     * Metode untuk melakukan pencarian dengan algoritma Jump Search
     * 
     * @param arr array terurut yang akan dicari
     * @param x nilai target yang dicari
     * @return indeks dari target jika ditemukan, -1 jika tidak ditemukan
     */
    public static int jumpSearch(int[] arr, int x) {
        // Mendapatkan panjang array
        int n = arr.length;
        
        //Menentukan ukuran lompatan (block size) berdasarkan akar kuadrat dari panjang array
        //Ukuran lompatan ini optimal untuk Jump Search
        int step = (int) Math.sqrt(n);
        
        //Menyimpan indeks awal blok yang sedang diperiksa
        int prev = 0;
        
        //Loop untuk mencari blok yang mungkin berisi elemen target
        //Loop terus berjalan selama indeks masih dalam batas array dan
        //elemen terakhir dari blok saat ini lebih kecil dari target
        while (prev < n && arr[Math.min(step, n) - 1] < x) {
            //Update indeks awal ke indeks akhir blok saat ini
            prev = step;
            
            //Maju ke blok berikutnya dengan menambahkan ukuran lompatan
            step += (int) Math.sqrt(n);
            
            //Jika indeks awal melebihi ukuran array, target tidak ditemukan
            if (prev >= n)
                return -1;
        }
        
        //Setelah menemukan blok yang mungkin berisi target,
        //lakukan pencarian linear dalam blok tersebut
        for (int i = prev; i < Math.min(step, n); i++) {
            //Jika elemen saat ini sama dengan target, kembalikan indeksnya
            if (arr[i] == x)
                return i;
        }
        
        //Jika target tidak ditemukan setelah pencarian linear, kembalikan -1
        return -1;
    }
}