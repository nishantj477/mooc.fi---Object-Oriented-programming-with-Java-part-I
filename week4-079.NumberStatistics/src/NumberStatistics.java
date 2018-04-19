
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum = 0;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        this.amountOfNumbers = 0;
    }

    public void addNumber(int number) {
        // code here
        amountOfNumbers++;
        sum += number;
    }

    public int amountOfNumbers() {
        // code here
        return amountOfNumbers;
    }
    
    public int sum() {
        // code here
       return sum;
    }
    
    public double average(){
        if (sum ==0)
            return 0;
       return ((double)sum / amountOfNumbers);
        
    }
}
