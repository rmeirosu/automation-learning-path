import java.math.BigDecimal;

/*
https://deloittedevelopment.udemy.com/course/learn-java-programming-crash-course/learn/lecture/12530668#overview
 */
public class Accuracy {
    public static void main(String[] args) {

        double result1 = 0.1 * 8;
        double result2 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;

        System.out.printf("result1 is %f %n", result1);
        System.out.printf("result2 is %f %n", result2);
        /*Both results are 0.8.
        Difference between result1 and result2 should be zero.*/

        double difference = result1 - result2;
        System.out.printf("The difference is %.99f %n", difference);
        /*The actual result is close to zero but not exactly zero.
        Some numbers can't be represented exactly in binary format.*/

        System.out.printf("result1 is %.99f %n", result1);
        System.out.printf("result2 is %.99f %n", result2);

        double result3 = 0.1 * 7;
        double result4 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;

        System.out.printf("result3 is %f %n", result1);
        System.out.printf("result4 is %f %n", result2);

        System.out.printf("result3 is %.99f %n", result3);
        System.out.printf("result4 is %.99f %n", result4);

        double difference2 = result3 - result4;
        System.out.printf("The difference2 is %.99f %n", difference2);

        /* Floating point arithmetic isn't completely accurate.
        BigDecimal solves most of the problems with rounding.*/
        BigDecimal oneTenth = BigDecimal.valueOf(0.1);
        BigDecimal result5 = oneTenth.multiply(BigDecimal.valueOf(7));
        BigDecimal result6 = oneTenth.add(oneTenth
                .add(oneTenth)
                .add(oneTenth)
                .add(oneTenth)
                .add(oneTenth)
                .add(oneTenth));

        BigDecimal difference3 = result5.subtract(result6);
        System.out.printf("The difference3 is %.99f %n", difference3);
        /*We don't use BigDecimal all the time instead of double due to performance.
        Arithmetic operations using BigDecimal is 20% slower.*/
    }
}