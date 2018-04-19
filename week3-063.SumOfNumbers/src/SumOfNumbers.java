import java.util.ArrayList;

public class SumOfNumbers {
    public static int sum(ArrayList<Integer> list) {
        // Write your code here
        int size = list.size();
        int i = 0;
        int res = 0;
        while(i < size){
        res += list.get(i);
        i++;
    }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The sum: " + sum(list));

        list.add(10);
        
        System.out.println("The sum: " + sum(list));
    }

}