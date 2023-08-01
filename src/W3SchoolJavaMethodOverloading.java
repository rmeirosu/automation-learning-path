public class W3SchoolJavaMethodOverloading {

    public static void main(String[] args) {

        /*
        With method overloading, multiple methods can have the same name with different parameters:

        int myMethod(int x)
        float myMethod(float x)
        double myMethod(double x, double y)
         */

        // Consider the following example, which has two methods that add numbers of different type:
//        int myNum1 = plusMethodInt(8, 5);
//        double myNum2 = plusMethodDouble(4.3, 6.26);
//
//        System.out.println("int: " + myNum1);
//        System.out.println("double: " + myNum2);

        // Method overload
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);

        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);

    }

    /*
    Instead of defining two methods that should do the same thing, it is better to overload one.

    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }
     */

    // In the example below, we overload the plusMethod method to work for both int and double:
    static int plusMethod(int x, int y) {
        return x + y;
    }
    static double plusMethod(double x, double y) {
        return x + y;
    }
}
