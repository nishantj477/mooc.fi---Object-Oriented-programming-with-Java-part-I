import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList <String> words = new ArrayList<String>();
        
        while(true){
            System.out.print("Type a word: ");
            String name = reader.nextLine();
            words.add(name);
            if(name.isEmpty()){
                Collections.reverse(words);
                System.out.println("You typed the following words: ");
                for(String item : words)
                    System.out.println(item);
              break;
            }  
        }
        
        
        
    }
}
