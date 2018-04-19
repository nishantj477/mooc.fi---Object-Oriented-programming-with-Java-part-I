import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        String reverse = "";
        System.out.println(reverse);
        char c;
        
        int len = name.length();
        int i = len-1;
        while(i >= 0){
            
            c = name.charAt(i);
            reverse  += c;
            i--;
            
        }
        System.out.println("In reverse order: " + reverse);
    }
}
