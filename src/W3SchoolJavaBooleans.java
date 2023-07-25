public class W3SchoolJavaBooleans {
    /*
    Very often, in programming, you will need a data type that can only have one of two values, like:

    YES / NO
    ON / OFF
    TRUE / FALSE
    For this, Java has a boolean data type, which can store true or false values.
     */

    public static void main(String[] args) {

        // A boolean type is declared with the boolean keyword and can only take the values true or false:
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun); // outputs true
        System.out.println(isFishTasty); // outputs false

        /*
        However, it is more common to return boolean values from boolean expressions, for conditional testing.
        A Boolean expression returns a boolean value: true or false.
        This is useful to build logic, and find answers.
        For example, you can use a comparison operator, such as the greater than (>) operator,
        to find out if an expression (or a variable) is true or false:
         */
        int x = 10;
        int y = 9;
        System.out.println(x > y); // outputs true because 10 > 9
        // Or even easier:
        System.out.println(10 > 9);

        // In the examples below, we use the equal to (==) operator to evaluate an expression:
        int a = 10;
        System.out.println(a == 10); // returns true
        System.out.println(a == 15); // returns false
        System.out.println(10 == 15); // returns false

        /*
        Real Life Example
        Let's think of a "real life example" where we need to find out if a person is old enough to vote.
        In the example below, we use the >= comparison operator to find out if the age (25)
        is greater than OR equal to the voting age limit, which is set to 18:
         */
        int myAge = 25;
        int votingAge = 18;
        System.out.println(myAge >= votingAge);

        /*
        An even better approach would be to wrap the code above in an if-else statement,
        so we can perform different actions depending on the result:
        */
        if (myAge >= votingAge) {
            System.out.println("Old enough to vote.");
        } else {
            System.out.println("Not old enough to vote!");
        }

        /*
        Exercises:
         */
        // Fill in the missing parts to print the values true and false:
        boolean isJavaFun2 = true;
        boolean isFishTasty2 = false;
        System.out.println(isJavaFun2);
        System.out.println(isFishTasty2);

        //Fill in the missing parts to print the value true:
        int q = 10;
        int w = 9;
        System.out.println(q > w);

    }
}
