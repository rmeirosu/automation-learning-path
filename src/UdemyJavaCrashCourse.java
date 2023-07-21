import java.math.BigDecimal;

public class UdemyJavaCrashCourse {
    /*
    https://deloittedevelopment.udemy.com/course/learn-java-programming-crash-course/learn/lecture/12530658#overview
     */
    public static void main(String[] args) {
    /* Primitive Data types
    https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
     */
        System.out.printf("byte minimum = %s, maximum = %s%n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        /*Use byte type when memory is an issue (e.g.: embedded applications)
        and when you're sure the value will be in byte range*/
        System.out.printf("short minimum = %s, maximum = %s%n", Short.MIN_VALUE, Short.MAX_VALUE);

        System.out.printf("int minimum = %s, maximum = %s%n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("long minimum = %s, maximum = %s%n", Long.MIN_VALUE, Long.MAX_VALUE);

        System.out.printf("float minimum = %s, maximum = %s%n", Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("double minimum = %s, maximum = %s%n", Double.MIN_VALUE, Double.MAX_VALUE);

        float f = 123.456789012345678F; //Need to specify 'F' because default for floating point in Java is double.
        double d = 123.456789012345678; //Since we declared it double, no need to specify 'D' at the end of number.
        System.out.printf("f is %.99f %n", f);
        System.out.printf("d is %.99f %n", d);
        System.out.println("f is " + f);
        System.out.println("d is " + d);
        //Double is far more precise than a float, that's why it's the default in Java

        BigDecimal z = new BigDecimal("123.45678901234567890123456789012345678");
        /*Typing the number as string we get full precision, otherwise it would be set to a double and lose precision.
        Accuracy of mathematical operations is greater with BigDecimal.
        !!!!!!!!!See Accuracy project.*/
        System.out.printf("z is %.99f %n", z);
    }
}
