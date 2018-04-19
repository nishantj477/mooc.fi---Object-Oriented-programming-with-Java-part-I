
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        String name;
        String number;
        String search;
        
        Scanner reader = new Scanner(System.in);
        
        ArrayList<Student> students = new ArrayList<Student>();
        
        while(true){
        System.out.print("name: ");
        name = reader.nextLine();
     
        if(name.isEmpty())
                break;
        
        System.out.print("studentnumber: ");
        number = reader.nextLine();
        students.add( new Student(name, number));
        
    }
        for (Student nm : students){
            System.out.println(nm);
        }
        
        System.out.print("Give search term: ");
        search = reader.nextLine();
        System.out.println("Result: ");
        
        for(Student nam : students){
            if(nam.getName().contains(search)){
                System.out.println(nam);
            }
        }
}
}