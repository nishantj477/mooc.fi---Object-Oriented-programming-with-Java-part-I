
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();
        
        while(true){
        System.out.print("Type a word: ");
        String name = reader.nextLine();
        
        if(words.contains(name)){
            System.out.println("You gave the word " + name + " twice");
            break;
        }
        else
            words.add(name);
        
        
    }
}
}
