
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added){
        Money sum = new Money((this.euros() + added.euros()), (this.cents() + added.cents()));
        return sum;
    }
    
     public boolean less(Money compared){
         double a = (this.euros()) + ((this.cents()) / 100.0) ;
         double b = (compared.euros()) + ((compared.cents()) / 100.0);
         if(a < b)
             return true;
         else
            return false;
     }
     
      public Money minus(Money decremented){
          int eu = this.euros() - decremented.euros();
          int ce = this.cents() - decremented.cents();
          
          if(eu < 0){
              eu = 0;
              ce = 0;
          }
          if(ce < 0){
              ce = 100 - (-ce);
              eu--;
          }
          Money m = new Money(eu, ce);
          return m;
  
         
          
          }
              

}
