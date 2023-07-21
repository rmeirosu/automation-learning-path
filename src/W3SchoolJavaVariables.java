public class W3SchoolJavaVariables {
    public static void main(String[] args) {
        //Create a variable called name of type String and assign it the value "John":
        String name = "Razvan";
        System.out.println(name);
        //Create a variable called myNum of type int and assign it the value 15:
        int myNum = 15;
        System.out.println(myNum);
        //You can also declare a variable without assigning the value, and assign the value later:
        int myNum2;
        myNum2 = 16;
        System.out.println(myNum2);
        /*Note that if you assign a new value to an existing variable, it will overwrite the previous value:
        Change the value of myNum from 15 to 20:*/
        myNum = 20;
        System.out.println(myNum);
        /*If you don't want others (or yourself) to overwrite existing values, use the final keyword
        (this will declare the variable as "final" or "constant", which means unchangeable and read-only):
        final int myNum3 = 15;
        myNum3 = 30; //will generate an error
        System.out.println(myNum3);*/
        //Create a variable named carName and assign the value Volvo to it.
        String carName = "Volvo";
        System.out.println(carName);
        //You can also use the + character to add a variable to another variable:
        String firstName = "Razvan";
        String lastName = "Meirosu";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        //For numeric values, the + character works as a mathematical operator (notice that we use int (integer) variables here):
        int x = 5;
        int y = 6;
        System.out.println(x + y);
        //To declare more than one variable of the same type, you can use a comma-separated list:
        int a = 5, b = 6, c = 7;
        //You can also assign the same value to multiple variables in one line:
        int q, w, e;
        q = w = e = 50;
        System.out.println(q + w + e);
        /*All Java variables must be identified with unique names.
        These unique names are called identifiers.
        Identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume).
        Note: It is recommended to use descriptive names in order to create understandable and maintainable code:
        Example:
        Good: int minutesPerHour = 60;
        OK, but not so easy to understand what m actually is: int m = 60;*/
    }
}
