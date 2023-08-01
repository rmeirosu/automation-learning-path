import java.util.List;

public class UdemyJavaCrashCourseS9 {
    /*
    https://deloittedevelopment.udemy.com/course/learn-java-programming-crash-course/learn/lecture/12877806#overview
    */
    public static void main(String[] args) {
        /*
        Dealing with Strings (Section 9)
        -A string is a sequence of zero or more Unicode characters.
        -Unicode is a way to represent different characters that are used when writing in various languages.
        */

        String courseName = "Learn Java for Beginners Crash Course";
        String message = "Welcome to ";

        // concatenate courseName and message to create a new String
        String fullMessage = message + courseName;
        System.out.println(fullMessage);

        // use string format
        String fullMessage2 = String.format("%s%s", message, courseName);
        System.out.println(fullMessage2);

        // use printf
        System.out.printf("Hello, and %sthe %s.%n", message, courseName);
        // The first %s is replaced by the first value after the string (message)
        // The second %s is replaced by the second value after the string (courseName)
        // %n creates a new line

        // We should be able to get each individual character from a String using indexing
        for (int i = 0; i < 37; i++) {
            char character = courseName.charAt(i);
            System.out.println(character);
        }//This is a full loop that will start from zero and get each character until 37th
        System.out.println();

        /*
        ==INDEXING==
        -Index positions start at 0:
                                       1         2         3
                             0123456789012345678901234567890123456
        String courseName = "Learn Java for Beginners Crash Course";
        String message = "Welcome to ";
         */
        System.out.println(courseName.charAt(0));
        // print first character using charAt() method to get the character at a specific index -> 'L'
        System.out.println(courseName.charAt(6));
        // print the 6th character using charAt() method to get the character at a specific index -> 'J'

        for (int i = 15; i < 23; i++) {
            // for loop prints all characters from position 15 up until position 23 (not included) -> 'Beginner'
            System.out.print(courseName.charAt(i));
        }
        System.out.println(); // to take the cursor to the next line

        /*
        ==LENGTH METHOD==
        -Length method returns the number of characters in a string.
        -It is useful to make sure we don't access anything beyond the length of the string -> crash
        with StringIndexOutOfBoundsException: String index out of range.
        -Instead of hardcoding a number to stop the loop we use the length method:
         */
        for (int i = 15; i < courseName.length(); i++) {
            // for loop prints all characters from position 15 up until the end of the string.
            System.out.print(courseName.charAt(i));
        }
        System.out.println(); // to take the cursor to the next line
        System.out.println(courseName.length()); // print the length of the string

        /*
        ==INDEX OF METHOD==
        -Checks to see if one string appears in another
         */

        List<String> matches = List.of(
                "life",
                "i need",
                "why don't",
                "i can",
                "are you",
                "what",
                "because",
                "sorry"
        );

        List<String> responses = List.of(
                "Life? Don't talk to me about life.",
                "Why do you need %1?",
                "Do you really think I don't %1?",
                "How do you know you can't %1?",
                "Why does it matter whether I am %1?",
                "Why do you ask?",
                "Is that the real reason?",
                "There are many times when no apology is needed.",
                "Please tell me more."
        );

        String userInput = "I think I need to learn Java";
        String output = "";
        String lowerCaseInput = userInput.toLowerCase();

        for (int index = 0; index < matches.size(); index++) {

            String match = matches.get(index);
            int position = lowerCaseInput.indexOf(match);

            if (position > -1) {
                // found a match
                output = responses.get(index);
                break;
            }

        }

        /*
        ==Case Insensitive IndexOf==
        -When comparing Strings in Java the comparison is case sensitive!
         */

//                                        1         2         3
//                              0123456789012345678901234567890123456
//        String courseName2 = "Learn Java for Beginners Crash Course";

        String courseName2 = "Learn Java for Beginners Crash Course";

        int position;
        int position2;

        position = courseName2.indexOf(" j"); // won't produce results because the search indexOf is case-sensitive
        System.out.println(position);

        position2 = indexOfIgnoreCase(courseName2, " j", 0); // result will be 5 - first match
        System.out.println(position2); // 5 will be printed out


        /*
        ==lastIndexOf and Repeated Matches==
         */
        int position3;

        position3 = courseName2.lastIndexOf(" C"); // two uppercase C in the String courseName - value of 30
        System.out.println(position3); // 30 will be printed out - last match

        //get all matches
        int position4 = -1;

//        position4 = indexOfIgnoreCase(courseName2, " j", 0); // search from start
//        System.out.println(position4); // print out 5
//        position4 = indexOfIgnoreCase(courseName2, " j", position4 + 1); // search the next occurrence
//        System.out.println(position4); // print out -1 meaning it only found one 'j'

// for more than one match (letter 'c') use the do-while loop:
        do {
            position4 = indexOfIgnoreCase(courseName2, " c", position4 + 1);
            // search from start and increase index
            System.out.println(position4);
        } while (position4 != -1); // search for all occurrences


        /*
        ==Processing Matches with replaceFirst and substring
         */

        String courseName3 = "Learn C# for Beginners Crash Course";

        int position5 = -1;

        do {
            position5 = indexOfIgnoreCase(courseName3, " c", position5 + 1);

            if (position5 != -1) {
                courseName3 = replaceByIndex(courseName3, position5, " c".length(), " Java");
                System.out.println(courseName3);
            }
        } while (position5 != -1);

        String fixedString = courseName3.replace(" Java", " C");
        System.out.println(fixedString);


        /*
        String Equality
        -In programming there are 2 definitions of equality:
            -two things can have the same value.
            -two things can be the same.
        -The string equals method focuses on the value of the string.
        -The equals equals (==) operator checks reference equality, not the value.
         */

        String first = "This is a String";
        String second = "This is a String";
        // all will print true
        System.out.println(first == second); // reference equality
        System.out.println(second == first);
        System.out.println(first.equals(second)); // value equality
        System.out.println(second.equals(first));

        String third = new String("This is a String"); // alternate way of creating a string
        // first two are false because we forced Java to create a new string instead of grabbing the value from the Java constant pool.
        System.out.println(first == third); // reference equality
        System.out.println(third == first);
        System.out.println(first.equals(third)); // value equality
        System.out.println(third.equals(first));


        /*
        Value and Reference Types
        -Java types fall into 3 categories:
            -value types.
            -reference types.
            -object types. (ignore for the moment)
        -Java Strings are reference types unlike the other built-in types.
         */
        int x = 5;
        int y = x;
        // both variables have the same value, but they are two different variables (they occupy different area of memory)
        // that area of memory stores the value of the variable
        System.out.printf("x = %d, y = %d %n", x, y);
        System.out.printf("x is the same as y: %s %n", x == y);

        String fourth = first;
        System.out.printf("first: %s %n", first);
        System.out.printf("fourth: %s %n", fourth);
        System.out.printf("first is the same as fourth: %s %n", first == fourth);

        /*
        Strings are Immutable
        -they cannot be changed
        -any method that appears to change the string is really creating a new one
         */

        System.out.println();

        System.out.printf("first: %s %n", first);
        System.out.printf("fourth: %s %n", fourth);

        // first.replace(" ", "_"); // this doesn't change the String, it creates a new String
        // we should assign the value to first again after the replacement:
        first = first.replace(" ", "_");
        System.out.printf("first is the same as fourth: %s %n", first == fourth);
        // this will result in false since first and fourth no longer refer to the same address in memory

        first = first.replace("_", " "); // replace and assign back.
        System.out.printf("first is the same as fourth: %s %n", first == fourth);
        // this will result in false since first and fourth no longer refer to the same address in memory
        // we should use .equals()
        System.out.printf("first.equals(fourth): %s %n", first.equals(fourth));
        // this will print true


        /*
        The StringBuilder Class
        -Changing a string by creating a new one is memory consuming and not very efficient for large number of changes.
        -Java provides a StringBuilder Class that works a lot like the String Class but allows its value to be
        modified without creating a new object each time.
         */
        System.out.println();
        StringBuilder fifth = new StringBuilder("This is a String");
        StringBuilder sixth = new StringBuilder("This is a String");

        String firstString = fifth.toString();
        String secondString = sixth.toString();

        System.out.printf("first: %s %n", firstString);
        System.out.printf("second: %s %n", secondString);
        System.out.printf("first is the same as second: %s %n", firstString == secondString); // false
        System.out.printf("first.equals(second): %s %n", firstString.equals(secondString)); // true


        /*
        Append, Delete and Method Chaining
         */

        System.out.println();
        System.out.println();
        StringBuilder firstFirst = new StringBuilder("This is a String");
        StringBuilder secondSecond = new StringBuilder("This is a String");

        System.out.printf("first: %s %n", firstFirst);
        System.out.println("clearing first");
//        firstFirst.delete(0, firstFirst.length());
//        firstFirst.append("Another String");
        firstFirst.delete(0, firstFirst.length()).append("Another String").append(" ").append(secondSecond);
        System.out.printf("first: *%s %n", firstFirst);

        // Method overload - same method using different types
        StringBuilder overLoad = new StringBuilder("This is a String");

        int a = 12;
        int b = 34;
        int c = 56;

        overLoad.append(' ');
        overLoad.append(a);
        overLoad.append(' ');
        overLoad.append(3.45);
        overLoad.append(' ');
        overLoad.append(a == 12);
        overLoad.append(' ');
        overLoad.append(b > c);
        overLoad.append(' ');
        overLoad.append("Java is great", 8, 13);

        System.out.println(overLoad);

    }

    private static String replaceByIndex(String original, int start, int lenth, String replacement) {
        String toRemove = original.substring(start, start + lenth);
        /*
        Figure out what needs to be removed by extracting the substring (part of the string)
        from the original string at the start position for the number of characters specified
        in the length parameter.
         */
        return original.replaceFirst(toRemove, replacement);
        /*
        A new string is created which has the parts of the string we extracted above, replaced
        with the contents of the replacement argument.
         */
    }

    private static int indexOfIgnoreCase(String text, String searchText, int fromIndex) {
        String textLowerCase = text.toLowerCase();
        String searchTextLowerCase = searchText.toLowerCase();
        return textLowerCase.indexOf(searchTextLowerCase, fromIndex);
    }
}
