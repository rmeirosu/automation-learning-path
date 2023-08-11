import org.jline.utils.Display;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class W3SchoolJavaDate {

    public static void main(String[] args) {

/*
Java Dates
Java does not have a built-in Date class, but we can import the java.time package to work with the date and time API.
The package includes many date and time classes. For example:

Class	            Description
LocalDate	        Represents a date (year, month, day (yyyy-MM-dd))
LocalTime	        Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
LocalDateTime	    Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
DateTimeFormatter	Formatter for displaying and parsing date-time objects
 */

        // To display the current date, import the java.time.LocalDate class, and use its now() method:
        LocalDate myObjDate = LocalDate.now(); // Create a date object
        System.out.println(myObjDate); // Display the current date

        // To display the current time (hour, minute, second, and nanoseconds),
        // import the java.time.LocalTime class, and use its now() method:
        LocalTime myObjTime = LocalTime.now();
        System.out.println(myObjTime);

        // To display the current date and time, import the java.time.LocalDateTime class, and use its now() method:
        LocalDateTime myObjDateTime = LocalDateTime.now();
        System.out.println(myObjDateTime);

        /*
        Formatting Date and Time
        The "T" in the example above is used to separate the date from the time.
        You can use the DateTimeFormatter class with the ofPattern() method in the same package to format
        or parse date-time objects. The following example will remove both the "T" and nanoseconds from the date-time:
         */
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}
