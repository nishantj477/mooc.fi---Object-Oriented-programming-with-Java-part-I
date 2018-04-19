/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nishant
 */

import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;
    
    public NightSky(double density){
        this.density = density;
        this.width = 20;
        this.height = 10;
    }
    
    public NightSky(int width, int height){
        this.density = 0.1;
        this.width = width;
        this.height = height;
    }
    
    public NightSky(double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;
    }
    
    public void printLine(){
        
        Random rand = new Random();
        Random random = new Random();
        
        int i;
        char a = '*';
        char b = ' ';
       
        
        for(i = 0 ; i < this.width ; i++ ){
            double n = rand.nextDouble();
             if(n < this.density){
                 System.out.print(a);
                    this.starsInLastPrint++;
             }
             else
                 System.out.print(b);
        }
    }
    
    public void print(){
        this.starsInLastPrint = 0;
        for(int j = 0 ; j < this.height ; j++){
            printLine();
            System.out.println();
        }
       
        
        
        
    }
    
    public int starsInLastPrint(){
        return this.starsInLastPrint;
    }
}
