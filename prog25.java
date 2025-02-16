// write a program to import and display date , month and year 

import java.time.LocalDate;

public class prog25 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now(); 
        System.out.println("Date: " + date.getDayOfMonth());
        System.out.println("Month: " + date.getMonthValue());
        System.out.println("Year: " + date.getYear());

// now() is a static method, which provides a predefined way to get the current date.
// LocalDate.now() is a static method inside the LocalDate class.
//  It returns an instance of LocalDate representing the current date
// Since it's static, we do not need to use new LocalDate(). The method directly gives us the object.

// note: we are not using java.util.Date becuase this package is deprecated and is no longer used in modern java( java 17 and plus)
     
    
    }
}
