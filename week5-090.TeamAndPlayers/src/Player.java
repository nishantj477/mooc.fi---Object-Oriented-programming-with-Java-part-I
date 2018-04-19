/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nishant
 */
public class Player {
    private String pname;
    private int ngoals;
    
    public Player(String s1){
        this.pname = s1;
    }
    
    public Player(String s2, int n1){
        this.pname = s2;
        this.ngoals = n1;
    }
    
    public String getName(){
        return this.pname;
    }
    
    public int goals(){
        return this.ngoals;
        
    }
    
    
    
    
    public String toString(){
        
        return this.getName() + ", " + "goals " + this.goals(); 
    }
   
    
}

