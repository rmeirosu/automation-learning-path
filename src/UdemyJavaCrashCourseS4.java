import java.math.BigDecimal;

public class UdemyJavaCrashCourseS4 {
    /*
    https://deloittedevelopment.udemy.com/course/learn-java-programming-crash-course/learn/lecture/12530658#overview
     */
    public static void main(String[] args) {
    /* Primitive Data types (Section 4: Java Types and Expressions)
    https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
     */
        System.out.printf("byte minimum = %s, maximum = %s%n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        /*Use byte type when memory is an issue (e.g.: embedded applications)
        and when you're sure the value will be in byte range*/
        System.out.printf("short minimum = %s, maximum = %s%n", Short.MIN_VALUE, Short.MAX_VALUE);

        System.out.printf("int minimum = %s, maximum = %s%n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("long minimum = %s, maximum = %s%n", Long.MIN_VALUE, Long.MAX_VALUE);

        System.out.printf("float minimum = %s, maximum = %s%n", Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("double minimum = %s, maximum = %s%n", Double.MIN_VALUE, Double.MAX_VALUE);

        float f = 123.456789012345678F; //Need to specify 'F' because default for floating point in Java is double.
        double d = 123.456789012345678; //Since we declared it double, no need to specify 'D' at the end of number.
        System.out.printf("f is %.99f %n", f);
        System.out.printf("d is %.99f %n", d);
        System.out.println("f is " + f);
        System.out.println("d is " + d);
        //Double is far more precise than a float, that's why it's the default in Java

        BigDecimal t = new BigDecimal("123.45678901234567890123456789012345678");
        /*Typing the number as string we get full precision, otherwise it would be set to a double and lose precision.
        Accuracy of mathematical operations is greater with BigDecimal.
        !!!!!!!!!See Accuracy project.*/
        System.out.printf("z is %.99f %n", t);


        /*Java Operators (Section 8: Operators)
        https://deloittedevelopment.udemy.com/course/learn-java-programming-crash-course/learn/lecture/12735623#overview
         */

        //Operator precedence: multiplication is always performed first.
        int answer = 7 + 3 * 4;
        System.out.println(answer);

        //Paranthesis are first
        int answer2 = (7 + 3) * 4;
        System.out.println(answer2);

        int x = 3;
//        int y = x++; //Increments the variable value by 1 but as side effect returns the original value.
        //correct way:
        int y = x;
        x++;
        System.out.printf("Using x++, x is %s and y is %s.%n", x, y);
        //Using x++, x is 4 and y is 3.

        x = 3;
//        y = ++x; //Increments the variable value by 1 but also returns the new value.
        //correct way:
        x++;
        y = x;
        System.out.printf("Using ++x, x is %s and y is %s.%n", x, y);
        //Using ++x, x is 4 and y is 4.

        System.out.println("Don't do this!");
        x = 3;
//        y = ++x - x++;
        //correct way:
        x++;
        int z = x;
        y = z - x; // or just y = 0;
        x++;
        System.out.printf("++x - x++ gives: x is %s and y is %s.%n", x, y);
        //++x - x++ gives: x is 5 and y is 0.

        x = 3;
//        y = x++ - ++x;
        //correct way:
        z = x;
        x += 2;
        y = z - x; // or just y = -2;
        System.out.printf("x++ - ++x gives: x is %s and y is %s.%n", x, y);
        //x++ - ++x gives: x is 5 and y is -2.

        /* Operator precedence */
        double a = 12 * 3 / 4.0;
        double b = (12 * 3) / 4.0;
        double c = 12 * (3 / 4.0);
        System.out.printf("%s %s %s %n", a, b, c);

        double g = 12.0 / 3.0 / 4.0;
        double h = (12.0 / 3.0) / 4.0;
        double i = 12.0 / (3.0 / 4.0);
        System.out.printf("%s %s %s %n", g, h, i);

        int j = 12 + 3 * 4;
        int k = (12 + 3) * 4;
        int l = 12 + (3 * 4);
        System.out.printf("%s %s %s %n", j, k, l);

        /*
        Remainder operator
        One general use for the remainder operator is to decide if one number divides exactly into another.
        */

        int xx = 12;
        int yy = 5;

        if (x % y == 0) {
            System.out.printf("%s divides exactly into %s%n", yy, xx);
        } else {
            System.out.printf("%s does not divide exactly into %s%n", yy, xx);
        }

        for (int month = 1; month <= 12; month++) {
            System.out.printf("The next month after %s is %s%n", month, month % 12 + 1);
        }

        /*
        Relational and Conditional operators
         */
        int second = 31;
        int minute = 1;

        if ((minute < 59) && ((second + 1) > 59)) {
            minute++;
        }

        /*
        Short circuit evaluation
        The && and || operators exhibit "short-circuit" behavior.
        This means that the second operand is evaluated only if needed.
         */

        int aa = 12;
        int bb = 0;

        if (bb != 0) { //check explicitly we're not dividing by zero so we don't get an exception.
            int cc = divideTwoNumbers(aa, bb);
            if (cc == 2) {
                System.out.println("We've found a 2.");
            }
        }
        //another way to write it:
        if (bb != 0 && divideTwoNumbers(aa, bb) == 2) {
            System.out.println("We've found a 2.");
        }
        //FALSE and anything will always be false

        if (bb == 0 || divideTwoNumbers(aa, bb) == 2) {
            System.out.println("We've found a 2.");
        }
        //TRUE and anything will always be true

    }
    private static int divideTwoNumbers(int x, int y) {
        return x / y;
    }
}
