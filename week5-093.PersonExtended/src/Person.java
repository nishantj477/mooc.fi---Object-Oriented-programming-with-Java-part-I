import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday) {
        this(name, birthday.getDay(), birthday.getMonth(), birthday.getYear());
    }
    public Person(String name) {
        this.name = name;
        int currDate = Calendar.getInstance().get(Calendar.DATE);
        int currMonth = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int currYear = Calendar.getInstance().get(Calendar.YEAR);
        this.birthday = new MyDate(currDate, currMonth, currYear);
    }
    
    public int age() {
// calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        int currDate = Calendar.getInstance().get(Calendar.DATE);
        int currMonth = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        int currYear = Calendar.getInstance().get(Calendar.YEAR);
        MyDate curr = new MyDate(currDate, currMonth, currYear);
        return this.birthday.differenceInYears(curr);
        
    }
    
    
    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        if(this.birthday.getYear() < compared.birthday.getYear())
            return true;
        
        else if (this.birthday.getYear() == compared.birthday.getYear()) {
            if(this.birthday.getMonth() < compared.birthday.getMonth())
                return true;
            
            else if(this.birthday.getMonth() == compared.birthday.getMonth()) {
                if(this.birthday.getDay() < compared.birthday.getDay()){
                    return true;
            }
        }
        }
           
        return false;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
