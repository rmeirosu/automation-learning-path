import java.util.ArrayList;
import java.util.Collections;

public class W3SchoolJavaArrayList {
/*
Java ArrayList
The ArrayList class is a resizable array, which can be found in the java.util package.

The difference between a built-in array and an ArrayList in Java,
is that the size of an array cannot be modified (if you want to add or remove elements to/from an array,
you have to create a new one). While elements can be added and removed from an ArrayList whenever you want.
 */

    public static void main(String[] args) {
    /*
    Example
    Create an ArrayList object called cars that will store strings:
    */
        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object

    /*
    Add Items
    The ArrayList class has many useful methods. For example, to add elements to the ArrayList, use the add() method:
    */
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

    /*
    Access an Item
    To access an element in the ArrayList, use the get() method and refer to the index number:
     */
        cars.get(0);

    /*
    Change an Item
    To modify an element, use the set() method and refer to the index number:
     */
        cars.set(0, "Opel");

    /*
    Remove an Item
    To remove an element, use the remove() method and refer to the index number:
     */
        cars.remove(0);


    /*
    To remove all the elements in the ArrayList, use the clear() method:
     */
        cars.clear();

    /*
    ArrayList Size
    To find out how many elements an ArrayList have, use the size method:
     */
        cars.size();


    /*
    Loop Through an ArrayList
    Loop through the elements of an ArrayList with a for loop,
    and use the size() method to specify how many times the loop should run:
     */

        ArrayList<String> cars2 = new ArrayList<String>();
        cars2.add("Volvo");
        cars2.add("BMW");
        cars2.add("Ford");
        cars2.add("Mazda");
        for (int i = 0; i < cars2.size(); i++) {
            System.out.println(cars2.get(i));
        }

    /*
    You can also loop through an ArrayList with the for-each loop:
     */
        ArrayList<String> cars3 = new ArrayList<String>();
        cars3.add("Volvo");
        cars3.add("BMW");
        cars3.add("Ford");
        cars3.add("Mazda");
        for (String i : cars3) {
            System.out.println(i);
        }

    /*
    Other Types
    Elements in an ArrayList are actually objects.
    In the examples above, we created elements (objects) of type "String".
    Remember that a String in Java is an object (not a primitive type).
    To use other types, such as int, you must specify an equivalent wrapper class: Integer.
    For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:
     */

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
        }

    /*
    Sort an ArrayList
    Another useful class in the java.util package is the Collections class,
    which include the sort() method for sorting lists alphabetically or numerically:
     */
        ArrayList<String> cars4 = new ArrayList<String>();
        cars4.add("Volvo");
        cars4.add("BMW");
        cars4.add("Ford");
        cars4.add("Mazda");
        Collections.sort(cars4);  // Sort cars
        for (String i : cars4) {
            System.out.println(i);
        }

    /*
    Sort an ArrayList of Integers:
     */
        ArrayList<Integer> myNumbers2 = new ArrayList<Integer>();
        myNumbers2.add(33);
        myNumbers2.add(15);
        myNumbers2.add(20);
        myNumbers2.add(34);
        myNumbers2.add(8);
        myNumbers2.add(12);

        Collections.sort(myNumbers2);  // Sort myNumbers

        for (int i : myNumbers2) {
            System.out.println(i);
        }


    }
}
