public class W3SchoolJavaInterface {

/*
Interfaces
Another way to achieve abstraction in Java, is with interfaces.
 */

    public static void main(String[] args) {

        Pig myPig = new Pig();  // Create a Pig object
        myPig.animalSound();
        myPig.sleep();

        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();

    }

    // An interface is a completely "abstract class" that is used to group related methods with empty bodies:
    interface Animal {
        public void animalSound(); // interface method (does not have a body)
        public void run(); // interface method (does not have a body)
    }

    /*
    To access the interface methods, the interface must be "implemented" (kinda like inherited)
    by another class with the implements keyword (instead of extends).
    The body of the interface method is provided by the "implement" class:
    */
    // Pig "implements" the Animal interface
    static class Pig implements Animal {
        public void animalSound() {
            // The body of animalSound() is provided here
            System.out.println("The pig says: wee wee");
        }

        public void sleep() {
            // The body of sleep() is provided here
            System.out.println("Zzz");
        }

        @Override
        public void run() {
        }
    }

    /*
    Notes on Interfaces:
    -Like abstract classes, interfaces cannot be used to create objects
    (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
    -Interface methods do not have a body - the body is provided by the "implement" class
    -On implementation of an interface, you must override all of its methods
    -Interface methods are by default abstract and public
    -Interface attributes are by default public, static and final
    -An interface cannot contain a constructor (as it cannot be used to create objects)
     */

    /*
    Multiple Interfaces
    To implement multiple interfaces, separate them with a comma:
     */
    interface FirstInterface {
        public void myMethod(); // interface method
    }

    interface SecondInterface {
        public void myOtherMethod(); // interface method
    }

    static class DemoClass implements FirstInterface, SecondInterface {
        public void myMethod() {
            System.out.println("Some text..");
        }
        public void myOtherMethod() {
            System.out.println("Some other text...");
        }
    }

}
