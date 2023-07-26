public class W3SchoolBreakContinue {
    /*
    Java Break
    You have already seen the break statement used in an earlier chapter of this tutorial.
    It was used to "jump out" of a switch statement.
    The break statement can also be used to jump out of a loop.
     */

    public static void main(String[] args) {

        // This example stops the loop when i is equal to 4:
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        /*
        Java Continue
        The continue statement breaks one iteration (in the loop), if a specified condition occurs,
        and continues with the next iteration in the loop.
         */

        // This example skips the value of 4:
        for (int j = 0; j < 10; j++) {
            if (j == 4) {
                continue;
            }
            System.out.println(j);
        }

        /*
        Break and Continue in While Loop
         */

        // You can also use break and continue in while loops:
        // Break Example:
        int k = 0;
        while (k < 10) {
            System.out.println(k);
            k++;
            if (k == 4) {
                break;
            }
        }

        // Continue Example:
        int l = 0;
        while (l < 10) {
            if (l == 4) {
                l++;
                continue;
            }
            System.out.println(l);
            l++;
        }

        //EXERCISE: Stop the loop if i is 5.
        for (int m = 0; m < 10; m++) {
            if (m == 5) {
                break;
            }
            System.out.println(m);
        }
    }
}
