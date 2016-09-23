package katav2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Katav2 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1995,2,24);
        
        Person person = new Person("Raúl",date);
        System.out.println(person.getName() + " tiene: " + person.getAge() + " años.");
    }
    
}
