/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nishant
 */
import java.util.*;
public class Phonebook {
    
     private ArrayList<Person> persons = new ArrayList<Person>();
    
    public void add(String name, String number){
        
        persons.add(new Person(name, number));
        
    }
    
    public void printAll(){
        
       for(Person s1 : persons)
           System.out.println(s1.getName() + " number: " + s1.getNumber());
    }
    
    public String searchNumber(String name){
        String num = "";
        for(Person p : persons){
            if(p.getName().equals(name)){
                num = p.getNumber();
            return num;
            }
        }
        return "number not known";
    }
}
