import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int len;
    private Random random = new Random();
    private String letters = "abcdefghijklmnopqrstuvwxyz";

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.len = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String pwd = "";
        int i = 0;
        while(i < this.len){
            int pos = random.nextInt(25);
            pwd += letters.charAt(pos); 
            i++;
        }
        return pwd; 
    }
}
