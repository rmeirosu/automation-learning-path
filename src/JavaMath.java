public class JavaMath {
    /*
    The Java Math class has many methods that allows you to perform mathematical tasks on numbers.
     */

    public static void main(String[] args) {

        /*
        Math.max(x,y)
        The Math.max(x,y) method can be used to find the highest value of x and y:
        */
        System.out.println(Math.max(5,10)); // prints out 10

        /*
        Math.min(x,y)
        The Math.min(x,y) method can be used to find the lowest value of x and y:
         */
        System.out.println(Math.min(5,10)); // prints out 5

        /*
        Math.sqrt(x)
        The Math.sqrt(x) method returns the square root of x:
         */
        System.out.println(Math.sqrt(64)); // prints out 8.0

        /*
        Math.abs(x)
        The Math.abs(x) method returns the absolute (positive) value of x:
         */
        System.out.println(Math.abs(-4.7)); // prints out 4.7

        /*
        Random Numbers
        Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
         */
        System.out.println(Math.random()); // prints out a random number

        /*
        To get more control over the random number, for example,
        if you only want a random number between 0 and 100, you can use the following formula:
         */
        int randomNum = (int)(Math.random() * 101); // 0 to 100
        System.out.printf("%s%n", randomNum); // prints out a number from 0 to 100

        /*
        Exercises:
        */
        // Use the correct method to find the highest value of x and y.
        int x = 5;
        int y = 10;
        System.out.println(Math.max(x,y));

        // Use the correct method to find the square root of x:
        int a = 16;
        System.out.println(Math.sqrt(a));

        // Use the correct method to return a random number between 0 (inclusive), and 1 (exclusive):
        System.out.println(Math.random());
    }
}
