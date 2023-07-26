public class W3SchoolJavaWhile {
/*
Loops can execute a block of code as long as a specified condition is reached.
Loops are handy because they save time, reduce errors, and they make code more readable.
 */
    public static void main(String[] args) {

// The while loop loops through a block of code as long as a specified condition is true:
        /*
        while (condition) {
            // code
        }
         */

// In the example below, the code in the loop will run, over and over again, as long as a variable (i) is less than 5:
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

/*
The Do/While Loop
The do/while loop is a variant of the while loop.
This loop will execute the code block once, before checking if the condition is true,
then it will repeat the loop as long as the condition is true.

        do {
            // code block to be executed
        } while (condition);
 */

/*
The example below uses a do/while loop.
The loop will always be executed at least once, even if the condition is false,
because the code block is executed before the condition is tested:
 */

        int i2 = 0;
        do {
            System.out.println(i2);
            i2++;
        } while (i2 < 5);

        // EXERCISE 1: Print i as long as i is less than 6.
        int i3 = 1;
        while (i3 < 6) {
            System.out.println(i3);
            i3++;
        }

        //EXERCISE 2: Use the do/while loop to print i as long as i is less than 6.
        int i4 = 1;
        do {
            System.out.println(i4);
            i4++;
        } while (i4 < 6);

        //EXERCISE 3: Use a for loop to print "Yes" 5 times.
        for (int i5 = 0; i5 < 5; i5++) {
            System.out.println("Yes");
        }

        //EXERCISE 4: Loop through the items in the cars array.
        String[] cars = {"Volvo", "BMW", "Ford"};
        for (String i6: cars) {
            System.out.println(i6);
        }

        //EXERCISE 5: Stop the loop if i is 5.
        for (int i7 = 0; i7 < 10; i7++) {
            if (i7 == 5) {
                break;
            }
            System.out.println(i7);
        }

        //EXERCISE 6: In the loop, when the value is "4", jump directly to the next value.
        for (int i8 = 0; i8 < 10; i8++) {
            if (i8 == 4) {
                continue;
            }
            System.out.println(i8);
        }
    }
}
