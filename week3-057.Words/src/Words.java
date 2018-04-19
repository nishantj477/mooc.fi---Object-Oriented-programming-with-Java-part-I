import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        while(true){
        System.out.print("Type a word: ");
        String name = reader.nextLine();
        words.add(name);
        if(name.equals("")){
            break;
        }
        
    }
        int size = words.size();
        int i = 0;
        System.out.println("You typed the following words:");
        while (i < size){
            System.out.println(words.get(i));
            i++;
        }
}
}
