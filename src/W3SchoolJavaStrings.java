public class W3SchoolJavaStrings {
/*
Java Strings
Strings are used for storing text.
 */
    public static void main(String[] args) {

        // A String variable contains a collection of characters surrounded by double quotes:
        String greeting = "Hello";

        /*
        String Length
        A String in Java is actually an object, which contain methods that can perform certain operations on strings.
        For example, the length of a string can be found with the length() method:
         */
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        /*
        More String Methods
        There are many string methods available, for example toUpperCase() and toLowerCase():
         */
        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt2.toLowerCase());   // Outputs "hello world"

        /*
        Finding a Character in a String
        The indexOf() method returns the index (the position) of the first occurrence
        of a specified text in a string (including whitespace):
         */
        String txt3 = "Please locate where 'locate' occurs!";
        System.out.println(txt3.indexOf("locate")); // Outputs 7

        /*
        String Concatenation
        The + operator can be used between strings to combine them. This is called concatenation:
         */
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        // Note that we have added an empty text (" ") to create a space between firstName and lastName on print.

        // You can also use the concat() method to concatenate two strings:
        String firstName2 = "John ";
        String lastName2 = "Doe";
        System.out.println(firstName2.concat(lastName2));

        /*
        Adding Numbers and Strings

        WARNING!
        Java uses the + operator for both addition and concatenation.
        Numbers are added. Strings are concatenated.

        If you add two numbers, the result will be a number:
         */
        int x = 10;
        int y = 20;
        int z = x + y;  // z will be 30 (an integer/number)
        System.out.println(z);

        // If you add two strings, the result will be a string concatenation:
        String x2 = "10";
        String y2 = "20";
        String z2 = x2 + y2;  // z will be 1020 (a String)
        System.out.println(z2);

        // If you add a number and a string, the result will be a string concatenation:
        String x3 = "10";
        int y3 = 20;
        String z3 = x3 + y3;  // z will be 1020 (a String)
        System.out.println(z3);

        /*
        Strings - Special Characters
        Because strings must be written within quotes, Java will misunderstand this string, and generate an error:

        String txt = "We are the so-called "Vikings" from the north.";
        The solution to avoid this problem, is to use the backslash escape character.

        The backslash (\) escape character turns special characters into string characters:

                Escape character:	    Result:	         Description:
                \'	                    '	             Single quote
                \"	                    "	             Double quote
                \\	                    \	             Backslash
         */

        // The sequence \"  inserts a double quote in a string:
        String txt4 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt4);

        // The sequence \'  inserts a single quote in a string:
        String txt5 = "It\'s alright.";
        System.out.println(txt5);

        // The sequence \\  inserts a single backslash in a string:
        String txt6 = "The character \\ is called backslash.";
        System.out.println(txt6);

        /*
        Other common escape sequences that are valid in Java are:

                Code:	        Result:
                \n	            New Line
                \r	            Carriage Return
                \t	            Tab
                \b	            Backspace
                \f	            Form Feed
         */


        // EXERCISE 1: Fill in the missing part to create a greeting variable of type String and assign it the value Hello.
        String greetingExercise = "Hello";

        // EXERCISE 2: Use the correct method to print the length of the txt string.
        String txtExercise2 = "Hello";
        System.out.println(txtExercise2.length());

        // EXERCISE 3 - Convert the value of txt to upper case.
        String txtExercise3 = "Hello";
        System.out.println(txtExercise3.toUpperCase());

        // EXERCISE 4 - Use the correct operator to concatenate two strings:
        String firstNameExercise4 = "John ";
        String lastNameExercise4 = "Doe";
        System.out.println(firstNameExercise4 + lastNameExercise4);

        // EXERCISE 5 - Use the correct method to concatenate two strings:
        String firstNameExercise5 = "John ";
        String lastNameExercise5 = "Doe";
        System.out.println(firstNameExercise5.concat(lastNameExercise5));

        // EXERCISE 6 - Return the index (position) of the first occurrence of "e" in the following string:
        String txtExercise6 = "Hello Everybody";
        System.out.println(txtExercise6.indexOf("e"));



    }
}
