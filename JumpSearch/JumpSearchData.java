package JumpSearch;  // Mendefinisikan package tempat class ini berada

public class JumpSearchData {
    
  
    public static int[] getData(int size) {
    
        int[] arr = new int[size];
        
        //Melakukan iterasi dari 0 sampai size-1
        for (int i = 0; i < size; i++) {
            //Mengisi array dengan nilai i+1, sehingga nilai dimulai dari 1 sampai size
            arr[i] = i + 1;
        }
   
        return arr;
    }
}