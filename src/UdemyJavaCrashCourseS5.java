import java.util.Scanner;

public class UdemyJavaCrashCourseS5 {

    /*
    Flow control
     */

    public static void main(String[] args) {

        /*
        For loop
        https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html
         */

        /*
        The for statement provides a compact way to iterate over a range of values.
        Programmers often refer to it as the "for loop" because of the way in which it
        repeatedly loops until a particular condition is satisfied.
        The general form of the for statement can be expressed as follows:

            for (initialization; termination; increment) {
                statement(s)
            }

        When using this version of the for statement, keep in mind that:

        The initialization expression initializes the loop; it's executed once, as the loop begins.
        When the termination expression evaluates to false, the loop terminates.
        The increment expression is invoked after each iteration through the loop;
        it is perfectly acceptable for this expression to increment or decrement a value.
         */

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // initializer is i = 0 -> only executed once at when for loop starts
        // condition is i < 5 -> is tested each time the for loop goes around
        // increment is i++ -> i value is incremented by one each time loop executes

        for (int i = 0; i < 10; i = i + 2) {
            System.out.println(i);
        }

        for (int i = 9; i > 0; i--) {
            System.out.println(i);
        }

        /*
        Challenge:
        Modify the for loop so that it also prints the value zero
         */
        for (int i = 9; i >= 0; i--) {
            System.out.println(i);
        }

        // Nested for loops:
        for (int i = 0; i <= 9; i++) {
            System.out.printf("row %d ", i);
            for (int j = 0; j <= 9; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        /*
        While loop
         */

        Scanner scanner = new Scanner(System.in);
        String userChoice = " ";

//        while (!userChoice.equals("q")) {
////        while (!(userChoice.equals("q") || userChoice.equals("Q"))) {
//
//            System.out.println("Please choose one of the following options");
//            System.out.println("1 - Cappucino");
//            System.out.println("2 - Latte");
//            System.out.println("3 - Americano");
//            System.out.println("4 - Mocha");
//            System.out.println("5 - Macchiato");
//            System.out.println("6 - Espresso");
//            System.out.println("Q - Quit the program");
//
//            userChoice = scanner.nextLine();
//
//            userChoice = userChoice.toLowerCase();
//            System.out.println("You chose " + userChoice);
//        }
//
//        scanner.close();

        /*
        Challenge:
        At the moment, the program displays the menu again, after each selection.
        Your challenge is to modify the code, so that the menu's only printed once.
        The code should still tell the user which key they pressed, but it shouldn't print the menu options again.
         */
        System.out.println("Please choose one of the following options");
        System.out.println("1 - Cappucino");
        System.out.println("2 - Latte");
        System.out.println("3 - Americano");
        System.out.println("4 - Mocha");
        System.out.println("5 - Macchiato");
        System.out.println("6 - Espresso");
        System.out.println("Q - Quit the program");
//
//        while (!userChoice.equals("q")) {
//            userChoice = scanner.nextLine();
//
//            userChoice = userChoice.toLowerCase();
//            System.out.println("You chose " + userChoice);
//        }
//
//        scanner.close();

        /*
        do-while Loop
        Same as while loop with the difference that the condition is tested at the end of the loop.
         */

        do {

            userChoice = scanner.nextLine();
            userChoice = userChoice.toLowerCase();
            System.out.println("You chose " + userChoice);

        } while (!userChoice.equals("q"));

        scanner.close();
    }
}
