package JumpSearch;  // Mendefinisikan package tempat class ini berada
/**
 * Class JumpSearchData yang menyediakan metode untuk menghasilkan data uji
 * yang akan digunakan dalam algoritma Jump Search
 */
public class JumpSearchData {
    
    /**
     * Metode statis untuk menghasilkan array berurutan dengan nilai 1 sampai size
     * 
     * @param size ukuran array yang akan dibuat
     * @return array berurutan dengan nilai dari 1 sampai size
     */
    public static int[] getData(int size) {
        //embuat array baru dengan ukuran yang diberikan sebagai parameter
        int[] arr = new int[size];
        
        //Melakukan iterasi dari 0 sampai size-1
        for (int i = 0; i < size; i++) {
            //Mengisi array dengan nilai i+1, sehingga nilai dimulai dari 1 sampai size
            arr[i] = i + 1;
        }
        
        //Mengembalikan array yang sudah diisi
        return arr;
    }
}