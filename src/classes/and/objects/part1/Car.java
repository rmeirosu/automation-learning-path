package classes.and.objects.part1;

public class Car {

     // access modifier is set to private which helps encapsulate the class
     private String make = "Tesla";
     private String model = "Model X";
     private String color = "Gray";
     private int doors = 2;
     private boolean convertible = true;

     // method to describe the car, access set to public to allow users to interact with the object
     public void describeCar() {
          System.out.println(doors + "-Door " +
                  color + " " +
                  make + " " +
                  model + " " +
                  (convertible ? "Convertible" : ""));
     }
}
