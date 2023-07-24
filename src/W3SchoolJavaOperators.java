public class W3SchoolJavaOperators {
/*
Operators are used to perform operations on variables and values.
Java divides the operators into the following groups:
    -Arithmetic operators
    -Assignment operators
    -Comparison operators
    -Logical operators
    -Bitwise operators
*/
    public static void main(String[] args) {
        Arithmetic arithmeticOps = new Arithmetic("arithmetic");
        Assignment assignmentOps = new Assignment("assignment");
        Comparison comparisonOps = new Comparison("comparison");
        Logical logicalOps = new Logical("logical");

        arithmeticOps.addition();
        arithmeticOps.subtraction();
        arithmeticOps.multiplication();
        arithmeticOps.division();
        arithmeticOps.modulus();
        arithmeticOps.increment();
        arithmeticOps.decrement();

        assignmentOps.assign();

        comparisonOps.equalTo();
        comparisonOps.notEqualTo();
        comparisonOps.greaterThan();
        comparisonOps.lessThan();
        comparisonOps.greaterThanOrEqual();
        comparisonOps.lessThanOrEqual();

        logicalOps.logicalAnd();
        logicalOps.logicalOr();
        logicalOps.logicalNot();


    }

        static class Arithmetic {
            private String name;

            public Arithmetic (String operationName) {
                name = operationName;
            }

            public void addition() {
                //In the example below, we use the + operator to add together two values:
                int x = 100 + 50;
                System.out.println("Addition operation result is: " + x);

                /*
                Although the + operator is often used to add together two values, like in the example above,
                it can also be used to add together a variable and a value, or a variable and another variable:
                */
                int sum1 = 100+50;
                int sum2 = sum1 + 250;
                int sum3 = sum2 + sum2;
                System.out.println("Sum1 is: " + sum1);
                System.out.println("Sum2 is: " + sum2);
                System.out.println("Sum3 is: " + sum3);

            }

            public void subtraction() {
                //Subtracts one value from another:
                int x = 100;
                int y = 50;
                int z = 100 - 28;
                System.out.println("Subtraction 1: x - y = " + (x - y));
                System.out.println("Subtraction 2: z = " + z);
            }

            public void multiplication() {
                //Multiplies two values:
                int x = 100;
                int y = 50;
                int z = 100 * 16;
                System.out.println("Multiplication 1: x * y = " + (x * y));
                System.out.println("Multiplication 2: z = " + z);
            }

            public void division() {
                //Divides one value by another
                int x = 100;
                int y = 50;
                int z = 100 / 9;
                System.out.println("Division 1: x / y = " + (x / y));
                System.out.println("Division 2: z = " + z);
            }

            public void modulus() {
                //Returns the division remainder
                int x = 50;
                int y = 7;
                int z = 28 % 5;
                System.out.println("Modulus 1: x % y = " + (x % y));
                System.out.println("Modulus 2: z = " + z);
            }

            public void increment() {
                //Increases the value of a variable by 1
                int x = 5;
                System.out.println("Increment: x is: " + x);
                int y = ++x;
                System.out.println("Increment: x incremented by 1 is: " + y);
            }

            public void decrement() {
                //Decreases the value of a variable by 1
                int x = 5;
                System.out.println("Decrement: x is: " + x);
                int y = --x;
                System.out.println("Decrement: x decremented by 1 is: " + y);
            }

        }

        static class Assignment {
        //Assignment operators are used to assign values to variables.
            private String name;

            public Assignment (String operationName) {
                name = operationName;
            }

            public void assign() {
                //In the example below, we use the assignment operator (=) to assign the value 10 to a variable called x:
                int a = 10;
                //The addition assignment operator (+=) adds a value to a variable:
                a += 3;
                System.out.println("Added value to a: " + a);
                //The subtraction assignment operator (-=) subtracts a value to a variable:
                int b = 10;
                b -= 3;
                System.out.println("Subtracted value from b: " + b);
                //The multiplication assignment operator (*=) multiplies the variable value:
                int c = 10;
                c *= 3;
                System.out.println("Multiplied value of c: " + c);
                //The division assignment operator (/=) divides the variable value:
                int d = 10;
                d /= 3;
                System.out.println("Divided value of d: "+ d);
                //Modulus assignment operator (%=): Divide x with 3 and assign the remainder to x.
                int e = 10;
                e %=3;
                System.out.println("Modulus assignment of e: " + e);
                /*Bitwise (at bit level) AND Assignment Operator is used to compute the Bitwise AND operation
                of left and right operands, and assign the result back to left operand*/
                int f = 10;
                f &= 3;
                System.out.println("Bitwise AND assignment: " + f);
                /*Bitwise (at bit level) OR Assignment Operator is used to compute the Bitwise OR operation
                of left and right operands, and assign the result back to left operand*/
                int g = 10;
                g |= 3;
                System.out.println("Bitwise OR assignment: " + g);
                /*Bitwise (at bit level) XOR Assignment Operator is used to compute the Bitwise XOR operation
                of left and right operands, and assign the result back to left operand*/
                int h = 10;
                h ^= 3;
                System.out.println("Bitwise XOR assignment: " + h);
                /*Bitwise (at bit level) Left-shift Assignment Operator is used to compute the Bitwise Left-shift
                operation of left and right operands, and assign the result back to left operand*/
                int i = 10;
                i >>= 3;
                System.out.println("Bitwise Left-shift assignment: " + i);
                /*Bitwise (at bit level) Right-shift Assignment Operator is used to compute the Bitwise Right-shift
                operation of left and right operands, and assign the result back to left operand*/
                int j = 10;
                j <<= 3;
                System.out.println("Bitwise Right-shift assignment: " + j);

            }

        }

        static class Comparison {
        /*
        Comparison operators are used to compare two values (or variables).
        This is important in programming, because it helps to find answers and make decisions.
        The return value of a comparison is either true or false. These values are known as Boolean values
         */
            private String name;
            public Comparison (String operationName) {
                name = operationName;
            }

            public void equalTo() {
                int x = 5;
                int y = 7;
                System.out.println("Is " + x + " equal to " + y + " ? " + (x == y));
            }

            public void notEqualTo() {
                int x = 5;
                int y = 7;
                System.out.println("Is " + x + " NOT equal to " + y + " ? " + (x != y));
            }

            public void greaterThan() {
                int x = 5;
                int y = 7;
                System.out.println("Is " + x + " greater than " + y + " ? " + (x > y));
            }

            public void lessThan() {
                int x = 5;
                int y = 7;
                System.out.println("Is " + x + " less than " + y + " ? " + (x < y));
            }

            public void greaterThanOrEqual() {
                int x = 5;
                int y = 5;
                System.out.println("Is " + x + " greater than or equal to " + y + " ? " + (x >= y));
            }

            public void lessThanOrEqual() {
                int x = 5;
                int y = 5;
                System.out.println("Is " + x + " less than or equal to " + y + " ? " + (x <= y));
            }
        }

        static class Logical {
            private String name;
            //Logical operators are used to determine logic between variables or values. Tests also for true or false.
            public Logical (String operationName) {
                name = operationName;
            }

            public void logicalAnd() {
                //Returns true if both statements are true:
                int x = 4;
                int y = 7;
                if ((x < 5) && (y < 10)) {
                    System.out.println("Both statements are true: x < 5 and y < 10:" + (x < 5) + " and " + (y < 10));
                }
                else {
                    System.out.println("Both statements are not true.");
                }
            }
            public void logicalOr() {
                //Returns true if any of the statements is true:
                int x = 5;
                int y = 9;
                if ((x < 5) || (y < 10)) {
                    System.out.println("Any of the statements is true: x < 5 and y < 10: " + (x < 5) + " or " + (y < 10));
                }
                else {
                    System.out.println("No statement is true.");
                }
            }

            public void logicalNot() {
                //Reverse the result, returns false if the result is true
                int x = 4;
                int y = 9;
                boolean z = !(x < 5 && x < 10); //x < 5 is true && x < 10 is true so the reverse is false
                System.out.println("Result of logical not is: " + z);
            }
        }
}

