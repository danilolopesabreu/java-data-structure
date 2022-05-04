package selection_insert_sort;
public class SelectionSort {
   
    public static void main (String[] args) {
        int [] array = {20,15,12,0,1,9,8,4,6,7,7,8,5,2,1};
        sorting(array);
        
        for(int i=0; i<array.length;i++){
          System.out.println(array[i]);
        }
    }
    
    private static void sorting(int [] array){
      for(int i=0;i<array.length;i++){
        
        int minorElementPosition = findMinorElementPosition(array, array[i], i);
        
        int valMin = array[minorElementPosition];
        int valGreat = array[i];
        
        array[minorElementPosition] = valGreat;
        array[i] = valMin;
        
      }
    }
    
    private static int findMinorElementPosition(int [] array, int valueToVerify, int startPoint){
      int tempValue = valueToVerify;
      int minorPosition = 0;
      
      for(int i = startPoint; i < array.length;i++){
        
        if(array[i] < tempValue){
          tempValue = array[i];
          minorPosition = i;
        }
        
      }
      
      return minorPosition;
    } 
}