
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
    public static int sum(ArrayList<Integer> list) {
        int size = list.size();
        int i = 0;
        int res = 0;
        while(i < size){
        res += list.get(i);
        i++;
    }
        return res;
    }
    

    public static double average(ArrayList<Integer> list) {
        // write code here
        double avg = (double)sum(list) / list.size();
        return avg;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}