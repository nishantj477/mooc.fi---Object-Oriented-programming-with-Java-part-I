import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        char ch = lastCharacter(name);
        System.out.println("Last character: " + ch);
        
    }
    public static char lastCharacter(String text){
        int len = text.length();
        char c = text.charAt(len-1);
        return c;
    }
}
