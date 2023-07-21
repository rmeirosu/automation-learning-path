/*
This contains exercises from 'Java Programming Masterclass updated to Java 17' from udemy 
(https://deloittedevelopment.udemy.com/course/java-the-complete-java-developer-course/)
*/

public class UdemyJavaMasterclass {
    public static void main(String[] args) {
        //Section 3 - First Steps
        System.out.println("Hello World");
        System.out.println("Hello, Razvan");
/////////////////////////////////////////////////////////////////////////////////		
		/*Section 3 - First Steps
		==Variables==
		-In general variables must be initialised before use.
		-A declaration statement is used to define a variable 
		 by indicating the data type, and the name, then 
		 optionally to set the variable to a specific value.
		-You can only declare once in a java block.
		-An expression is a coding construct, that evaluates to a single value.
		*/
        int myFirstNumber = 5; //declaration statement
        System.out.println("Variable value is:" + myFirstNumber);
        myFirstNumber = 10; //assigned a new value to the variable
        System.out.println("New value is:" + myFirstNumber);
        myFirstNumber = 1000; //change again - challenge
        System.out.println("New new value is:" + myFirstNumber);
        myFirstNumber = 10 + 5; //value change using math
        System.out.println("Math value is:" + myFirstNumber);
        myFirstNumber = (10 + 5) + (2 *10); //more math
        System.out.println("More math: " + myFirstNumber);
        //Java operators (+, *, etc) perform an operation on a variable value.
/////////////////////////////////////////////////////////////////////////////////		
		/*Section 3 - First Steps
		==Starting out with Expressions==*/
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        //use variable names directly in the expression of a declaration
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println("Total is " + myTotal);
        //more operations
        myThirdNumber = myFirstNumber * 2;
        myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println("New total is " + myTotal);
        //challenge
        int myLastOne = 1000 - myTotal;
        System.out.println("My Last Math is " + myLastOne);
/////////////////////////////////////////////////////////////////////////////////		
		/*Section 3 - First Steps
		==Primitive Types==
		-most basic data types
		-8 primitive data types by type of data stored for each:
			1. whole number: byte, short, int, long
			2. real number: float, double
			3. single character: char
			4. boolean value: boolean*/
        int myValue = 10000; //integer is a whole number, no fractions or decimals
        int myMinIntValue = Integer.MIN_VALUE; //find out minimum value for int datatype using the wrapper class (Integer)
        int myMaxIntValue = Integer.MAX_VALUE; //find out maximum value for int datatype
        System.out.println("Integer Value Range: ("+ myMinIntValue +" to "+ myMaxIntValue+ ")");
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1)); //Overflow - put a value larger than max into an int
        //maximum value when it overflows wraps around to the minimum value and continues processing
        System.out.println("Busted Min Value = " + (myMinIntValue - 1)); //Underflow - put a smaller value than min into an int
        //minimum value, when it underflows wraps around to the maximum value and continues processing
		/*int myMaxIntTest = 2147483648;
			-Assigning a value outside the range throws an error.*/
/////////////////////////////////////////////////////////////////////////////////		
		/*Section 3 - First Steps
		==byte, short, long and width==
		-byte supports the smallest range
		-long support the largest range
		-byte < short < int < long
		-Size, or Width is the amount of space (in memory)that determines (or limits) 
		 the range of values we've been discussing:
			-A byte can store 256 numbers and occupies 8 bits and has a width of 8.
			-A short can store a large range of numbers and occupies 16 bits and has a width of 16.
			-An int has a much larger range, 32 bits and width of 32.
			-A long has 64 bits and width of 64.*/
        System.out.println("Byte Value Range: (" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ")");
        System.out.println("Short Value Range: (" + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")");
        long myLongValue = 100L; //Java default stores as int. We've stored a small value (100) as a long
        System.out.println("A Long has a width of: " + Long.SIZE);
        System.out.println("Long Value Range: (" + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ")");
/////////////////////////////////////////////////////////////////////////////////		
		/*Section 3 - First Steps
		==Casting in Java==
		Casting is a way to get Java to treat a variable of one type like a different data type.*/
        byte myMinByteValue = Byte.MIN_VALUE;
		/*byte myNewByteValue = (myMinByteValue / 2); -throws error incompatible type
			-Java compiler does not attempt to evaluate the value, in a variable, when it's used
			in a calculation, so it doesn't know if the value fits and throws an error.
			-We let Java know that it will fit with a concept called Casting.
			-Casting means to treat or convert a number from one type to another.
			-We put the type we want the number to be in parentheses.*/
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        System.out.println("myNewByteValue is: " + myNewByteValue);
/////////////////////////////////////////////////////////////////////////////////			
		/*Section 3 - First Steps
		==Primitive Types Challenge==
		Create four new variables:
			-A byte variable, set it to any valid byte number, it doesn't matter.
			-A short variable, set it to any valid short number.
			-An int variable, set it to any valid integer number.
			-A long variable. Make it equal to 50000 plus 10 times the sum of the values of the first 3 variables
			(your byte, your short and your int values). In other words, use the variable names in your expression
			to calculate the sum.*/
        byte aByteVar = 100;
        short aShortVar = 20_000;
        int aIntVar = 3_000_000;
        long aLongVar = (50_000 + (10 * (aByteVar + aShortVar + aIntVar)));
        System.out.println("My Long variable is: " + aLongVar);
/////////////////////////////////////////////////////////////////////////////////
		/*Section 3 - First Steps
		==Float and Double Primitives==
		-Floating-point number is used for more precision in calculations.
		-There are 2 primitive types in Java for expressing floating-point numbers, the float and the double.
		-The double is Java's default type for any decimal or real number because it is more precise.
		-Precision refers to the format and amount of space occupied by the relevant type.
		-Width and range for float and double:
			-float - width 32 bits, min value = 1.4E-45 (1.4 x 10 to the power 45), max value = 3.4028235E38 (3.4 x 10 to the power 38)
			-double - width 64 bits, min value = 4.9E-324, max value = 1.7976931348623157E308*/
        System.out.println("Float Range Value (" + Float.MIN_VALUE + " to " + Float.MAX_VALUE + ")");
        System.out.println("Double Range Value (" + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ")");
        int myIntValue = 5;
        float myFloatValue = 5F;
        double myDoubleValue = 5D;
        System.out.println("Values are: myIntValue = " + myIntValue + ", " + "myFloatValue = "
                + myFloatValue + ", " + "myDoubleValue = " + myDoubleValue);
/////////////////////////////////////////////////////////////////////////////////		
		/*Section 3 - First-Steps	
		==Floating Point Precision and a Challenge==*/
        myIntValue = 5 / 2; //both 5 and 2 are int and the result is an int value (2) instead of decimal (2.5)
        System.out.println("myIntValue is: " + myIntValue);
        myFloatValue = 5F / 2F; //changing to float we'll see the decimal precision
        System.out.println("myFloatValue is: " + myFloatValue);
        myDoubleValue = 5D / 2D;
        System.out.println("myDoubleValue is: " + myDoubleValue);
        //Change the divisor to 3
        myIntValue = 5 / 3;
        System.out.println("new myIntValue is: " + myIntValue);
        myFloatValue = 5F / 3F;
        System.out.println("new myFloatValue is: " + myFloatValue);
        myDoubleValue = 5D / 3D; //note the change in precision
        System.out.println("new myDoubleValue is: " + myDoubleValue);
        myDoubleValue = 5.00 / 3.00; //using decimals instead of suffix (D) and Java will know it's a double type - resulting a double
        System.out.println("decimal myDoubleValue is: " + myDoubleValue);
        myDoubleValue = 5.00 / 3; //using only one operand with decimals and Java will know it's a double type - resulting a double
        System.out.println("one operand double myDoubleValue is: " + myDoubleValue);
		/*Challenge: Convert a given number of pounds to kilograms.
		STEPS:
			1. Create a var with the appropriate type, to store the number of pounds that we want to convert.
			2. Calculate kg using the variable above and store the result in a 2nd appropriately typed variable.
			3. Print the result.
			4. Conversion formula: 1 pounds is equal to 0.45359237 of a kilogram.*/
        double storePounds = 200D;
        double storeKilograms = storePounds * 0.45359237;
        System.out.println(storePounds + " pounds = " + storeKilograms + " kg.");
		/*  -In general float and double are great for general floating point operations.
			-But neither should be used when precise calculations are required.
			-This is due to a limitation with how floating point numbers are stored.
			-Java has a class called BigDecimal that overcomes this.*/
/////////////////////////////////////////////////////////////////////////////////
		/*Section 3 - First-Steps	
		==The char and boolean Primitive Data Types==*/
        char myChar = 'D';
        System.out.println("Literal representation of char: " + myChar + " ('D')");
		/*Differences between char and String:
		char: 
			-Holds one and only one character.
			-Literal enclosed in Single Quotes ('').
		String:
			-Can hold multiple characters.
			-Literal enclosed in Double Quotes ("").*/
        myChar = '\u0044';
        System.out.println("Unicode representation of char: " + myChar + " (u0044)");
        myChar = 68;
        System.out.println("Integer representation of char: " + myChar + " (68)");
		/* Char Challenge:
		Create three char variables to store the character for the question-mark symbol:
			1.mySimpleChar should be assigned the literal question-mark character: ?.
			2.myUnicodeChar should be assigned the unicode value for the question-mark character: ?. 
			3.myDecimalChar should be assigned the decimal value for the question-mark character: ?.
		Print all three variables in one statement, that starts with the label 'My values are '.*/
        char mySimpleChar = '?';
        char myUnicodeChar = '\u003f';
        char myDecimalChar = 63;
        System.out.println("My values are " + mySimpleChar + ", " + myUnicodeChar + ", " + myDecimalChar);
        //Boolean - A boolean value allows for two opposite choices, true or false, yes or no, one or zero.
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = true;
		/*often use the word 'is' as a prefix for a boolean variable name. also 'has', etc.
		this identifies more clearly as what condition is tested.*/
/////////////////////////////////////////////////////////////////////////////////
		/*Section 3 - First-Steps	
		==Primitive Types Recap and the String Data Type==
		A String is a class that contains a sequence of characters.*/
        String myString = "This is a string";
        System.out.println("myString is equal to: " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to: " + myString);
        myString = "I wish I had \u00241,000,000.00";
        System.out.println("myString is equal to: " + myString);
        {
            String lastString = "10";
            int myInt = 50;
            lastString = lastString + myInt;
				/*even though we've used an integer data type 
				we'll have the values concatenated ("1050")
				because lastString variable was configured as String*/
            System.out.println(lastString);
            //more examples
            double doubleNumber	= 120.47;
            lastString = lastString + doubleNumber;
            System.out.println(lastString);
        }
		/*Strings are immutable:
		-Immutable means that you can't change a String after it's created.
		-In our above examples, the value 120.47 is technically not appended to the current contents of lastString.
		-Instead, a new String is created automatically by Java. The new String consists of the previous value
		of lastString, plus a textual representation of the double value 120.47.
		-The old string will be discarded from memory automatically.

		String vs StringBuilder:
		-The String class is immutable, but can be used much like a primitive data type.
		-The StringBuilder class is mutable, but does not share the String's special features,
		such as being able to assign it a String literal or use the + operator on it.*/
/////////////////////////////////////////////////////////////////////////////////
		/*Section 3 - First-Steps	
		==Operators, Operands and Expressions==
		Operators:
			-Operators in Java are special symbols that perform specific operations on one, two or 
			three operands and then return a result.
		Operands:	
			-An operand is a term used to describe any object that is manipulated by an operator.
		Example:
			-example: int myVar = 15 + 12; '+' sign is the operator, '15' and '12' are the operands.
			-Variables used instead of literals (myVar instead of 15) can be used as operands.
		Expressions:
			-An expression is formed by combining variables, literals, method return values and 
			operators.
			-They are a way of forming and combining those values to produce a result.*/
        {
            int result = 1 + 2; // 1 + 2 = 3
            int previousResult = result;
            result = result - 1; // 3 - 1 = 2
            System.out.println(result);
        }
        {
            char firstChar ='A';
            char secondChar = 'B';
            System.out.println(firstChar + secondChar); //result is 131
			/*When using + operator with char, it adds together the byte numbers of the char.
			Character values don't get concatenated.*/
            System.out.println("" + firstChar + secondChar); //results in AB
			/*Starting with double quotes ("") means an empty string which is a string literal.
			Any plus (+) after a string is going to be a concatenation operator.*/
        }
        {
            int result = 2;
            result = result * 10; //multiplication - 2 * 10 = 20
            System.out.println(result);
            result = result / 4; //division - 20 / 4 = 5
            System.out.println(result);
        }
        {
			/*The Remainder operator
			-Is represented in Java by the % sign.
			-It goes by several other names: modulus, modulo or just plan mod for short.
			-It returns the remaining value from a division operation.
			-If there is no remaining value the result is 0.*/
            int result = 5;
            result = result % 3; // the remainder of (5 % 3) = 2
            System.out.println(result);
        }
/////////////////////////////////////////////////////////////////////////////////
		/*Section 3 - First-Steps	
		==Abbreviating Operators==*/
        {
            int result = 1;
            result = result + 1;
            System.out.println("result by normal math = " + result);
            result = result - 1;
            System.out.println("result by normal math = " + result);
        }
		/*Incrementing by One:
		-Is a very common requirement in programming.
		-We can do: result = result + 1; But we also have two other shorthand ways to do this same thing:
			-Post-fix Increment Operator: result++;
			-Compound Assignment Operator with + sign: result+=1;
		Decrementing by One:
		-Also very common.
		-We can do: result = result - 1; But we also have two other shorthand ways to do this same thing:
			-Post-fix Decrement Operator: result--;
			-Compound Assignment Operator with - sign: result-=1;
		-Unlike Increment and Decrement we can use Compound Assignment to do more than just +1.
		*/
        {
            int result = 1;
            result++; //postfix increment operator
            System.out.println("result by postfix increment operator = " + result);
            result--; //postfix decrement operator
            System.out.println("result by postfix decrement operator = " + result);
        }
        {
            int result = 1;
            result += 1; //compound assignment operator with + sign
            System.out.println("result by compound assignment with plus = " + result);
            result -= 1; //compound assignment operator with - sign
            System.out.println("result by compound assignment with minus = " + result);
        }
        {
            int result = 1;
            result += 5; //compound assignment for more than just +1
            System.out.println("compound assignment with plus more than just +1 = " + result);
            result -= 5; //compound assignment for more than just -1
            System.out.println("compound assignment with minus more than just -1= " + result);
        }
		/*Challenge:
			1. Initialize an int variable, named result, to the value of 10, rather than 1.
			2. Use the compound assignment operator with the minus signe to subtract
			a number from result, using a value of your choice.
			3. Print the result.*/
        {
            int result = 10;
            result -= 12;
            System.out.println("increment challenge result = " + result);
        }
        {
            int result = 10;
            result -= 5.5; //normal math results in 4.5 but due to incompatible data type it prints 4
            //result = result - 5.5; //note the error thrown for conversion from double to int
            //what java does is implicitly cast to int when using compound assignment: result = (int) (result - 5.5);
            System.out.println("challenge result with incompatible data type = " + result);
        }
        {
            double result = 10; //changing the data type to double will ensure correct calculation results
            result -= 5.5;
            System.out.println("challenge result with correct data type = " + result);
        }
        {
            double result = 10;
            result *= 1.5; //multiplication
            System.out.println("compound assignment division multiplication = " + result);
        }
        {
            double result = 10;
            result /= 1.5; //division
            System.out.println("compound assignment division division = " + result);
        }
    }
}