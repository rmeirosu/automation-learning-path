package classes.and.objects.part1;

public class Car {

     // access modifier is set to private which helps encapsulate the class
     private String make = "Tesla";
     private String model = "Model X";
     private String color = "Gray";
     private int doors = 2;
     private boolean convertible = true;

     // public method to return the field make
     public String getMake() {
          return make;
     }

     public String getModel() {
          return model;
     }

     public String getColor() {
          return color;
     }

     public int getDoors() {
          return doors;
     }

     public boolean isConvertible() {
          return convertible;
     }

     public void setMake(String make) { // method is void because a setter method sets values, it doesn't retrieve
          if (make == null) make = "Unknown";
          String lowercaseMake = make.toLowerCase();
          switch (lowercaseMake) {
               case "holden", "porsche", "tesla" -> this.make = make;
               default -> {
                    this.make = "Unsupported ";
               }
          }
     }

     public void setModel(String model) {
          this.model = model;
     }

     public void setColor(String color) {
          this.color = color;
     }

     public void setDoors(int doors) {
          this.doors = doors;
     }

     public void setConvertible(boolean convertible) {
          this.convertible = convertible;
     }

     // method to describe the car, access set to public to allow users to interact with the object
     public void describeCar() {
          System.out.println(doors + "-Door " +
                  color + " " +
                  make + " " +
                  model + " " +
                  (convertible ? "Convertible" : ""));
     }
}
