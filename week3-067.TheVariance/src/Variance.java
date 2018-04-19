import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
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
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double avg = (double)sum(list) / list.size();
        return avg;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
       int a = list.size();
       int sum1 = sum(list);
       double avg1 = average(list);
       double var1 = 0;
       double var2;
       
       for(int x : list){
           var1 += Math.pow((x - avg1), 2);
       }
       var2 = var1 / (a - 1);
       return var2;
       
       
       
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
