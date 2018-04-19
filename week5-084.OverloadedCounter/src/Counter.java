/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nishant
 */
public class Counter {
    private int n;
    private boolean a;
    private int b;
    
   
  public Counter(int startingValue, boolean check){
        n = startingValue;
        a = check;
      
        }

    
     public Counter(int startingValue){
         n = startingValue;
         
     }
     

    public Counter(boolean check){
        n = 0;
        a = check;
            
}

    public Counter(){
        n = 0;
    }
    
    public int value(){
        return n;
    }
    
    public void increase(){
        n++;
    }
    
    public void decrease(){
        n--;
        if(n < 0 && a == true)
            chk();  
    }    
    
    public void chk()
    {
        n = 0;
    }
    
    public void increase(int increaseAmount){
        if(increaseAmount > 0)
            n += increaseAmount;
    }
    
    
    public void decrease(int decreaseAmount)
    {
        if( decreaseAmount > 0  && a == true)
        {
             if(n - (decreaseAmount) > 0){
                    n -= decreaseAmount;
             }
             else
               n = 0;
        }
     else if(decreaseAmount > 0 && a == false){
                n -= decreaseAmount;
             }
    
    
}
}
