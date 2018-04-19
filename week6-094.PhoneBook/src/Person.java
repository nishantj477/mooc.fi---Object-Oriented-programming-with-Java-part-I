/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nishant
 */
public class Person {
    private String name;
    private String n;
    
    public Person(String name ,String n){
        this.name = name;
        this.n = n;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getNumber(){
        return this.n;
    }
    
    public String toString(){
        return this.getName() + " number: " + this.getNumber(); 
    }
    
    public void changeNumber(String num){
        this.n = num;
    }
    
    
    
}
