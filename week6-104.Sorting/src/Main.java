import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }
    
    public static int smallest(int[] array) {
    // write the code here
        int a = array[0];
        for(int i = 1 ; i < array.length ; i++){
            if(array[i] < a)
                a = array[i];
                
        }
        return a;
}
    public static int indexOfTheSmallest(int[] array){
        int a = array[0];
        int in = 0;
        for(int i = 1 ; i < array.length ; i++){
            if(array[i] < a){
                a = array[i];
                in = i;
            }
                
        }
        return in;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
    // write the code here
        int b = array[index];
        int idx = index;
        for(int j = index + 1 ; j < array.length ; j++){
            if(b > array[j]){
                b = array[j];
            idx = j;
        }
        
        
}
        return idx;
    }
    
    public static void swap(int[] array, int index1, int index2) {
    // code goes here
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        
}
    
    public static void sort(int[] array) {
        for(int i = 0 ; i < array.length - 1 ; i++){
          
            for(int j = 0 ; j < array.length - i - 1 ; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
                
            }
            System.out.println(Arrays.toString(array));
            
            
        }
}
  

}
