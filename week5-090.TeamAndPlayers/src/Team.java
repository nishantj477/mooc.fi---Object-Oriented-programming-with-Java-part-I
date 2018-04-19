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

public class Team {
    private String tname;
    private int size = 16;
    private ArrayList<Player> players = new ArrayList<Player>();
    


    
    public Team(String name){
        this.tname = name;
    }
    
    public String getName(){
        return this.tname;
    }
    
    public void addPlayer(Player p){
        if(this.players.size() < this.size)
                this.players.add(p);
    }
    
    
    public void printPlayers(){
        for(Player p1 : players){
                System.out.println(p1.toString());
    }
    }
        
        public void setMaxSize(int maxSize){
            this.size = maxSize;
            
        }
        
        public int size(){
            if(this.players.size()==0)
                return 0;
            else
                return (this.players.size());
            
       }
        
        public int goals(){
             int sum = 0;
             for(Player p3 : players){
                 sum += p3.goals();
                 
             }
             return sum;
        }
        
        
}
