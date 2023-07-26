public class W3SchoolJavaIfElse {
    /*
     * Java Conditions and If Statements
     * You already know that Java supports the usual logical conditions from mathematics:
     *
     * Less than: a < b
     * Less than or equal to: a <= b
     * Greater than: a > b
     * Greater than or equal to: a >= b
     * Equal to a == b
     * Not Equal to: a != b
     * You can use these conditions to perform different actions for different decisions.
     *
     * Java has the following conditional statements:
     * Use if to specify a block of code to be executed, if a specified condition is true
     * Use else to specify a block of code to be executed, if the same condition is false
     * Use else if to specify a new condition to test, if the first condition is false
     * Use switch to specify many alternative blocks of code to be executed
     */
    public static void main(String[] args) {

        /*
        The if Statement
        Use the if statement to specify a block of Java code to be executed if a condition is true.

            if (condition) {
                // block of code to be executed if the condition is true
            }
         */

        /*
        In the example below, we test two values to find out if 20 is greater than 18.
        If the condition is true, print some text:
         */
        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }

        // We can also test variables:
        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        }


        /*
        The else Statement
        Use the else statement to specify a block of code to be executed if the condition is false.

            if (condition) {
              // block of code to be executed if the condition is true
            } else {
              // block of code to be executed if the condition is false
            }
         */
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        // Outputs "Good evening."
        /*
        In the example above, time (20) is greater than 18, so the condition is false.
        Because of this, we move on to the else condition and print to the screen "Good evening".
        If the time was less than 18, the program would print "Good day".
         */


        /*
        The else if Statement
        Use the else if statement to specify a new condition if the first condition is false.

            if (condition1) {
              // block of code to be executed if condition1 is true
            } else if (condition2) {
              // block of code to be executed if the condition1 is false and condition2 is true
            } else {
              // block of code to be executed if the condition1 is false and condition2 is false
            }
         */
        int newTime = 22;
        if (newTime < 10) {
            System.out.println("Good morning.");
        } else if (newTime < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        // Outputs "Good evening."
        /*
        In the example above, time (22) is greater than 10, so the first condition is false.
        The next condition, in the else if statement, is also false,
        so we move on to the else condition since condition1 and condition2 is both false - and
        print to the screen "Good evening".
        However, if the time was 14, our program would print "Good day."
         */


        /*
        Short Hand If...Else
        There is also a short-hand if else, which is known as the ternary operator
        because it consists of three operands.
        It can be used to replace multiple lines of code with a single line,
        and is most often used to replace simple if else statements:

            variable = (condition) ? expressionTrue :  expressionFalse;

         */

        // Instead of:
        int time2 = 20;
        if (time2 < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // You can write:
        int time3 = 20;
        String result = (time3 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);


        // EXERCISE 1: Print "Hello World" if x1 is greater than y1.
        int x1 = 50;
        int y1 = 10;
        if (x1 > y1) {
            System.out.println("Hello World");
        }

        // EXERCISE 2: Print "Hello World" if x2 is equal to y2.
        int x2 = 50;
        int y2 = 50;
        if (x2 == y2) {
            System.out.println("Hello World");
        }

        // EXERCISE 3: Print "Yes" if x3 is equal to y3, otherwise print "No".
        int x3 = 50;
        int y3 = 50;
        if (x3 == y3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // EXERCISE 4: Print "1" if x4 is equal to y4, print "2" if x4 is greater than y4, otherwise print "3".
        int x4 = 50;
        int y4 = 50;
        if (x4 == y4) {
            System.out.println("1");
        } else if (x4 > y4) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }

        // EXERCISE 5: Insert the missing parts to complete the following
        // "short hand if...else statement" (ternary operator):
        int timp = 20;
        String result2 = (timp < 18) ? "Good day." : "Good evening.";
        System.out.println(result2);

    }
}
