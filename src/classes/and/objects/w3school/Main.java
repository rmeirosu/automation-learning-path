package classes.and.objects.w3school;

public class Main {
    int modelYear;
    String modelName;

    public Main(int year, String name){
        modelYear = year;
        modelName = name;
    }
    public static void main(String[] args) {
        // EXERCISE 2: Create an object of MyClass called myObj.
        MyClass myObj = new MyClass();

        // EXERCISE 3: Use myObj to access and print the value of the x attribute of MyClass.
        System.out.println(myObj.x);

        // EXERCISE 4: Call myMethod on the object.
        myObj.myMethod();

        Main myCar = new Main(1969, "Mustang");            // Create a myCar object
        myCar.fullThrottle();               // Call the fullThrottle() method
        myCar.speed(200);         // Call the speed() method
        System.out.println(myCar.modelYear + " " + myCar.modelName);

    }

    // Create a fullThrottle() method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    // Create a speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }
}
