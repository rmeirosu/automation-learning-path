public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Razvan");
    /*
    https://deloittedevelopment.udemy.com/course/java-the-complete-java-developer-course/learn/lecture/34998528#overview
    */
        boolean isAlien = true;
        if (isAlien == false)
            /* Two equal signs (==) are the Equality Operator.
            No semicolon at the end because the line below is dependent on the one above.*/
            System.out.println("It is not an alien!");
            /*The line below will always be executed because it's not dependent on the if.
            We should use a code block.*/
        System.out.println("And I am scared of aliens");

        boolean isAlien2 = false;
        //Block of code:
        if (isAlien2 == false) {
            System.out.println("It is not a second alien!");
            System.out.println("And I am scared of second aliens.");
        }

        int topScore = 80;
        if (topScore >= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 70;
        if ((topScore > secondTopScore) && (topScore < 100)) { // "&&" is a Logical Operator meaning AND
            System.out.println("Greater than second top score and less than 100");
        }

        int thirdTopScore = 40;
        if ((secondTopScore > thirdTopScore) || (secondTopScore < 70)) { // "||" is a Logical Operator meaning OR
            System.out.println("Either or both conditions are true");
        }

        //Challenge
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if (isCar) { //no need to equate to true, we return the value of isCar, in essence we test for it if it's true
            System.out.println("This is not supposed to happen");
        }

        /*Ternary Operator:
        operand1 ? operand2 : operand3
        Tests if operand1 is true. If true returns operand2. If false returns operand3*/
        String makeOfCar = "Volkswagen";
        //boolean isDomestic = makeOfCar == "Volkswagen" ? false : true; //this is usually simplified like:
        boolean isDomestic = (makeOfCar != "Volkswagen");
        if (isDomestic) {
            System.out.println("This car is domestic");
        }

        int ageOfClient = 20;
        String ageText = (ageOfClient >= 18) ? "Over Eighteen" : "Still a kid";
        System.out.println("Our client is " + ageText);

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        /*Challenge:
        1. Create a double variable with a value of 20.00.
        2. Create a second variable of type double with a value of 80.00.
        3. Add both numbers together then multiply by 100.00.
        4. Use the remainder operator to figure out what the remainder
        from the result of the operation in step 3 and 40.00 will be.
        5. Create a boolean variable that assigns the value true if the
        remainder in step four is 0.00 or false if it's not zero.
        6. Output the boolean variable just to see what the result is.
        7. Write an if-then statement that displays a message 'got some remainder'
        if the boolean in step 5. is not true.*/
        double firstVariable = 20.00;
        double secondVariable = 80.00;
        double result = (firstVariable + secondVariable) * 100.00;
        System.out.println("result is = " + result);
        double remainderResult = result % 40.00;
        System.out.println("This is the remainder = " + remainderResult);
        boolean isZeroRemainder = (remainderResult == 0.00);
        System.out.println("Is remainder zero? = " + isZeroRemainder);
        if (!isZeroRemainder) {
            System.out.println("Got some remainder...");
        }
    }
}
