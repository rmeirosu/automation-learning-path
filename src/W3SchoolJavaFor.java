public class W3SchoolJavaFor {
    /*

    Java For Loop
    When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:

    SYNTAX:
        for (statement 1; statement 2; statement 3) {
            // code block to be executed
        }

    -Statement 1 is executed (one time) before the execution of the code block.
    -Statement 2 defines the condition for executing the code block.
    -Statement 3 is executed (every time) after the code block has been executed.

    */

    public static void main(String[] args) {

        // The example below will print the numbers 0 to 4:
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        /*
        -Statement 1 sets a variable before the loop starts (int i = 0).
        -Statement 2 defines the condition for the loop to run (i must be less than 5).
         If the condition is true, the loop will start over again, if it is false, the loop will end.
        -Statement 3 increases a value (i++) each time the code block in the loop has been executed.
         */

        // This example will only print even values between 0 and 10:
        for (int i2 = 0; i2 < 10; i2 = i2 + 2) {
            System.out.println(i2);
        }

        /*
        Nested Loops
        It is also possible to place a loop inside another loop. This is called a nested loop.
        */

        // The "inner loop" will be executed one time for each iteration of the "outer loop":
        // Outer loop
        for (int i3 = 1; i3 <= 2; i3++) {
            System.out.println("Outer: " + i3); // Executes 2 times

            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }

        //EXERCISE: Use a for loop to print "Yes" 5 times:
        for (int k = 0; k < 5; k++) {
            System.out.println("Yes");
        }

    /*
    For-Each Loop
    There is also a "for-each" loop, which is used exclusively to loop through elements in an array:

        for (type variableName : arrayName) {
            // code block to be executed
        }
    */

        // The following example outputs all elements in the cars array, using a "for-each" loop:
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Dacia"};

        for (String i : cars) {
            System.out.println(i);
        }
    }

}
