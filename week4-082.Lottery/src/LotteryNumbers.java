import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;
    private int n;
    private int s;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.random = new Random();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber
        while(true){
                n =  1 + random.nextInt(39);
                if(containsNumber(n) == false)
                       this.numbers.add(n);
                if(this.numbers.size() == 7)
                    break;
                
            }
        }

    /*private boolean containsNumber(int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        return numbers.contains(number);
    }
}
