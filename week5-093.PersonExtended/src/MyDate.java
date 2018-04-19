
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    
    
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differenceInYears(MyDate comparedDate) {
         if(this.year < comparedDate.year){
             int tempYear= this.year; int tempMonth = this.month; int tempDay = this.day;
             int days = 0;
             while(true) {
                 if(tempYear == comparedDate.year && tempMonth == comparedDate.month && tempDay == comparedDate.day)
                     break;
                 
                 tempDay++;
                 days++;
                 
                 if(tempDay > 30){
                     tempDay = 1;
                     tempMonth++;
                     if(tempMonth % 2 == 1) {
                         days++;
                     }
                     if(tempMonth > 12 && tempDay == 1){
                         tempMonth = 1;
                         tempYear++;
                     }
                 }
             }
             //System.out.println(days);
             return days / 366;
         }
         else {
             int tempYear= comparedDate.year; int tempMonth = comparedDate.month; int tempDay = comparedDate.day;
             int days = 0;
             while(true) {
                 if(tempYear == this.year && tempMonth == this.month && tempDay == this.day){
                     
                     break;
                 }
                  
                 
                 tempDay++;
                 days++;
                 
                 if(tempDay > 30){
                     tempDay = 1;
                     tempMonth++;
                     if(tempMonth % 2 == 1) {
                         days++;
                     }
                     if(tempMonth > 12 && tempDay == 1){
                         tempMonth = 1;
                         tempYear++;
                     }
                 }
             }
             //System.out.println(days);
             return days / 366;
         }
    }

  
}