public class ClassesIntro {
    public static void main(String[] args) {

        Masina myCar = new Masina("Ford");
        Masina anotherCar = new Masina("BMW");

        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();
        myCar.brake();
        myCar.brake();
        myCar.accelerate();

        anotherCar.brake();
        anotherCar.accelerate();
        anotherCar.accelerate();
        anotherCar.accelerate();
        anotherCar.brake();
        anotherCar.brake();

    }
}

class Masina {
//Classes can have different type of members

    private int speed = 0;
    private String name;

    public Masina(String carName) {
        /*
        This is a constructor.
        Our cars don't have names yet, we can give our Car class a name and provide it when we create each instance.
         */
        name = carName;
    }
    public void accelerate() {
        if (speed >=0) {
            speed +=1;
        }
//        System.out.printf("%s is going %d kilometers per hour.%n", name, speed);
        showSpeed();
    }
    /*
    This is a method.
    Methods are members of a class.
    Methods are members that perform actions.
    Fields are members that store state or values that represent some aspect of each class instance.
    In our Car class, a Field could be used to store car speed information (how fast).
     */

    public void brake() {
        if (speed > 0) {
            speed -=1;
//            System.out.printf("%s is going %d kilometers per hour.%n", name, speed);
            showSpeed();
        }
        else System.out.printf("%s is not moving, it cannot go slower.%n", name);
    }

    private void showSpeed() {
        System.out.printf("%s is going %d kilometers per hour.%n", name, speed);
        /*
        Setting the method to private will ensure it will only be used as part of the Class it's in.
        It won't be usable outside the Car class.
         */
    }
}