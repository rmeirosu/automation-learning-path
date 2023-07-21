public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("I am learning Java");
        System.out.println("It is awesome!");
        System.out.println("You can use println to print numbers:");
        System.out.println(3);
        System.out.println(358);
        System.out.println(50000);
        System.out.println("You can also print math:");
        System.out.println(3 + 3);
        System.out.println(2 * 5);
        System.out.println("This line has a comment after it.");
        //This is a single-line comment
        System.out.println("This line has a multi-line comment after it.");
			/* This is a
			multi-line
			comment*/

        //Variables
        String varString = "This is a string of text"; //This is a string
        int varInt = 123; //This is an integer
        float varFloat = 12.22f; //f append makes it float instead of double
        char varChar = 'a'; //This is a single character
        boolean varBool = true; //This is a boolean - true or false
        //Print the variable values
        System.out.println("String: " + varString);
        System.out.println("Integer: " + varInt);
        System.out.println("Float: " + varFloat);
        System.out.println("Char: " + varChar);
        System.out.println("Boolean: " + varBool);
			/* You can also declare a variable without assigning the value,
				And assign the value later*/
        int myNum;
        myNum = 15;
        System.out.println("This is an int with value declared later: " + myNum);
			/*If you assign a new value to an existing variable,
				It will overwrite the previous value*/
        myNum = 20;
        System.out.println("Same variable with new value: " + myNum);
			/*If you don't want the value to be overwritten,
				use the final keyword (this declares the variable
				as final or constant)*/
        final int myNewNum = 16;
        System.out.println("This is a final var: " + myNewNum);
        //Assign new value to final var
        //myNewNum = 21; //This will generate a compilation error
    }
}