
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int allScores = 0;
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        System.out.println("Type exam scores, -1 completes:");
        ArrayList<Integer> marks = new ArrayList<Integer>();
        while (true) {
            int x = Integer.parseInt(reader.nextLine());
            if (x == -1) {
                break;
            }
            marks.add(x);
            allScores++;
        }
        
        System.out.println("Grade distribution:");
        gradeDistribution(marks);
        int accepted = 0;
        for(int x : marks){
            if(x > 29)
                accepted++;
        }
        
        System.out.println("Acceptance percentage: " + 100*accepted/(float)allScores);
    }

    public static void gradeDistribution(ArrayList<Integer> marks) {
        
        int[] count = {0,0,0,0,0,0};
        for(int num : marks) {
            if(num <= 29 && num >= 0)
                count[0]++;
            if(num <= 34 && num >= 30)
                count[1]++;
            if(num <= 39 && num >= 35)
                count[2]++;
            if(num <= 44 && num >= 40)
                count[3]++;
            if(num <= 49 && num >= 45)
                count[4]++;
            if(num <= 60 && num >= 50)
                count[5]++;
        }
        
        for(int i = 5; i >= 0 ; i--) {
            System.out.print(i + ": ");
            for(int j = count[i]; j >0; j--)
                System.out.print("*");
            System.out.println("");
        }
    }
}
