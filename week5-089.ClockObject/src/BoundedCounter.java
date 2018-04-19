
public class BoundedCounter {
    // copy here the class BoundedCounter from last weeks assignment 78 

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.upperLimit = upperLimit;
        this.value = 0;
    }

    public void next() {
        // write code here
        this.value++;
        if(this.value > this.upperLimit)
            this.value = 0;
    }

    public String toString() {
        // write code here
        if(this.value < 10)
            return "0" + this.value;
        else
            return "" + this.value;
        
    }
    
    public int getValue() {
    // write here code that returns the value
        return this.value;
    }
    
    public void setValue(int n){
        if(n >= 0 && n <= this.upperLimit) {
            this.value = n;
        }
}
}


