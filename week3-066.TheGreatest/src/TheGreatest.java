import java.util.ArrayList;
import java.util.Collections;

public class TheGreatest {
    public static int greatest(ArrayList<Integer> list) {
        // write code here
        Collections.sort(list);
        int size = list.size();
        int i = list.get(size - 1);
        return i;
        
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        
        System.out.println("The greatest number is: " + greatest(lista));
    }
}