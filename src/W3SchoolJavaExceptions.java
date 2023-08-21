public class W3SchoolJavaExceptions {
    /*
    Java Exceptions
    When executing Java code, different errors can occur:
    coding errors made by the programmer, errors due to wrong input, or other unforeseeable things.

    When an error occurs, Java will normally stop and generate an error message.
    The technical term for this is: Java will throw an exception (throw an error).
     */

    public static void main(String[] args) {

        /*
        Java try and catch
        The try statement allows you to define a block of code to be tested for errors while it is being executed.

        The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.

        The try and catch keywords come in pairs:

        Syntax:
            try {
                //  Block of code to try
            }
            catch(Exception e) {
                //  Block of code to handle errors
            }
         */
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }

        /*
        Finally
        The finally statement lets you execute code, after try...catch, regardless of the result:
         */
        try {
            int[] myNumbers2 = {1, 2, 3};
            System.out.println(myNumbers2[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }

        /*
        The throw keyword
        The throw statement allows you to create a custom error.

        The throw statement is used together with an exception type.
        There are many exception types available in Java:
        ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc:
         */
//        checkAge(15); // Set age to 15 (which is below 18...)



        // EXERCISE 1
        // Insert the missing parts to handle the error in the code below.
        try
        {
            int[] myNumbers3 = {1, 2, 3};
            System.out.println(myNumbers3[10]);
        }
        catch
        (Exception e) {
            System.out.println("Something went wrong.");
        }


        // EXERCISE 2
        // Insert the missing keyword to execute code, after try..catch, regardless of the result.
        try {
            int[] myNumbers4 = {1, 2, 3};
            System.out.println(myNumbers4[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
        finally
        {
            System.out.println("The 'try catch' is finished.");
        }

    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }

}
