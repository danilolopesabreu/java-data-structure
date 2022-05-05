package selection_insert_sort;
public class InsertionSort {
   
    public static void main (String[] args) {
        int [] array = {20,15,12,0,1,9,8,4,6,7,7,8,5,2,1};
        sorting(array);
        
        for(int i=0; i<array.length;i++){
          System.out.println(array[i]);
        }
    }
    
    private static void sorting(int [] array){
    
      for(int i=1;i<array.length;i++){
        int analysing = i;
        for(int j = i-1; j >= 0; j--){
        
          int actual = array[analysing];
          int before = array[j];
        
          if(actual < before){
            int valMin = array[analysing];
            int valGreat = array[j];
      
            array[analysing] = valGreat;
            array[j] = valMin;
            analysing--;
          }
          
        }
        
      }
      
    }
    
    
}