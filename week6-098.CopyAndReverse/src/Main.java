
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write testcode here
    int[] original = {1, 2, 3, 4};
    int[] reverse = reverseCopy(original);

    // print both
    System.out.println( "original: " +Arrays.toString(original));
    System.out.println( "reversed: " +Arrays.toString(reverse));
}

    public static int[] copy(int[] array){
        int n = array.length;
        int [] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = array[i];
        }
        return arr;
    }
    
    public static int[] reverseCopy(int[] array){
        int l = array.length - 1;
        int [] rev = new int[l + 1];
        int i = 0;
        while(l >= 0){
            rev[i++] = array[l--];
        }
        return rev;
    }
}
   
