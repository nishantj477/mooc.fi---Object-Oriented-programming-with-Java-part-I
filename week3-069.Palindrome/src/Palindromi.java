import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        int n = text.length();
        int i = n-1;
        
        String rev = "";
        
        while(i >= 0){
           rev += text.charAt(i); 
           i--;
        }
      if(rev.equals(text))
          return true;
      else
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();  
        
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
