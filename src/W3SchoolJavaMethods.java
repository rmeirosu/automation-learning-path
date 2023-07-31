/*
A method is a block of code which only runs when it is called.
You can pass data, known as parameters, into a method.
Methods are used to perform certain actions, and they are also known as functions.

Information can be passed to methods as parameter. Parameters act as variables inside the method.
Parameters are specified after the method name, inside the parentheses.
You can add as many parameters as you want, just separate them with a comma.

Return Values
The void keyword, used in the examples above, indicates that the method should not return a value.
If you want the method to return a value, you can use a primitive data type (such as int, char, etc.)
instead of void, and use the return keyword inside the method.
 */

public class W3SchoolJavaMethods {

    /*
    Create a Method.
    A method must be declared within a class. It is defined with the name of the method, followed by parentheses ().
    Java provides some pre-defined methods, such as System.out.println(),
    but you can also create your own methods to perform certain actions:
     */
    static void myMethod() {
     /*
     -myMethod() is the name of the method

     -static means that the method belongs to the Main class and not an object of the Main class.
     You will learn more about objects and how to access methods through objects later in this tutorial.

     -void means that this method does not have a return value.
    */
        System.out.println("I just got executed");
    }

    static void myMethod2(String fname) {
        System.out.println(fname + " Doe");
    }

    static int myMethod3(int x) {
        return 5 + x;
    }

    static void myMethod4(String fname, int age){
        System.out.println(fname + " is " + age);
    }

    static int myMethod5(int x, int y) {
        return x + y;
    }

    /*
    Method Overloading
    With method overloading, multiple methods can have the same name with different parameters:
     */

    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    /*
    Instead of defining two methods that should do the same thing, it is better to overload one.
    In the example below, we overload the plusMethod method to work for both int and double:
     */

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }


    /*
    Java Scope
    In Java, variables are only accessible inside the region they are created. This is called scope.

    Method Scope
    Variables declared directly inside a method are available anywhere in the method
    following the line of code in which they were declared:

        // Code here CANNOT use x

        int x = 100;

        // Code here can use x
        System.out.println(x);
     */

    /*
    Block Scope
    A block of code refers to all of the code between curly braces {}.

    Variables declared inside blocks of code are only accessible by the code between the curly braces,
    which follows the line in which the variable was declared:

        Example:
        public class Main {
          public static void main(String[] args) {

            // Code here CANNOT use x

            { // This is a block

              // Code here CANNOT use x

              int x = 100;

              // Code here CAN use x
              System.out.println(x);

            } // The block ends here

          // Code here CANNOT use x

          }
        }
     */

    /*
    Java Recursion
    Recursion is the technique of making a function call itself.
    This technique provides a way to break complicated problems down into simple problems which are easier to solve.

    Recursion Example:
    Adding two numbers together is easy to do, but adding a range of numbers is more complicated.
    In the following example, recursion is used to add a range of numbers together
    by breaking it down into the simple task of adding two numbers:

    Example: Use recursion to add all of the numbers up to 10.

        public class Main {

          public static void main(String[] args) {
            int result = sum(10);
            System.out.println(result);
          }

          public static int sum(int k) {

            if (k > 0) {
              return k + sum(k - 1);

            } else {
              return 0;
            }
          }

        }

    Example Explained:
    When the sum() function is called, it adds parameter k to the sum of all numbers smaller than k
    and returns the result. When k becomes 0, the function just returns 0. When running, the program follows these steps:

        10 + sum(9)
        10 + ( 9 + sum(8) )
        10 + ( 9 + ( 8 + sum(7) ) )
        ...
        10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
        10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0

    Since the function does not call itself when k is 0, the program stops there and returns the result.
     */

    /*
    Halting Condition
    Just as loops can run into the problem of infinite looping,
    recursive functions can run into the problem of infinite recursion.
    Infinite recursion is when the function never stops calling itself.
    Every recursive function should have a halting condition, which is the condition where the function stops calling itself.
    In the previous example, the halting condition is when the parameter k becomes 0.

    It is helpful to see a variety of different examples to better understand the concept. In this example, the function adds a range of numbers between a start and an end. The halting condition for this recursive function is when end is not greater than start:

    Example
    Use recursion to add all of the numbers between 5 to 10.

        public class Main {

          public static void main(String[] args) {
            int result = sum(5, 10);
            System.out.println(result);
          }

          public static int sum(int start, int end) {

            if (end > start) {
              return end + sum(start, end - 1);

            } else {
              return end;
            }
          }

        }
     */


    // EXERCISE 5
    // Create a checkAge() method with an integer variable called age
    static void checkAge(int age) {
        // If age is less than 18, print "Access denied"
        if (age < 18) {
            System.out.println("Access denied");

            // If age is greater than, or equal to, 18, print "Access granted"
        } else {
            System.out.println("Access granted");
        }
    }

    public static void main(String[] args) {
    /*
    Call a Method
    To call a method in Java, write the method's name followed by two parentheses () and a semicolon;
     */

        // EXERCISE 1 - Insert the missing part to call myMethod from main.
        myMethod();

        // EXERCISE 2 - Insert the missing part to call myMethod from main two times.
        myMethod();
        myMethod();

        // EXERCISE 3 - Add a fname parameter of type String to myMethod, and output "John Doe".
        myMethod2("John");

        // EXERCISE 4 - Insert the missing part to print the number 8 in main, by using a specific keyword inside myMethod:
        System.out.println(myMethod3(3));

        // EXERCISE 5 - Follow the comments to insert the missing parts of the code below:

        // Call the checkAge method and pass along an age of 20
        checkAge(20);

        myMethod4("Razvan", 2);

        int z = myMethod5(10,20);
        System.out.println(z);

        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);

        int myNum11 = plusMethod(8, 5);
        double myNum21 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum11);
        System.out.println("double: " + myNum21);

    }


}
