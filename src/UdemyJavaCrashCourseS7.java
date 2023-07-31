public class UdemyJavaCrashCourseS7 {

    /*
    Section 7 - Flow control: Methods
     */

    public static void main(String[] args) {

        Car myCar = new Car("Tim's car");
        Car anotherCar = new Car("The Batmobile");

        myCar.accelerate(10);
        myCar.accelerate(23);
        myCar.accelerate(50);
        myCar.accelerate(10);
        myCar.brake(90);
        myCar.accelerate(15);

        anotherCar.brake(2);
        anotherCar.brake(90);
    }
}

class Car {

    private int speed = 0;
    private String name;

    public Car(String carName) {
        name = carName;
    }

    public void accelerate(int amount) {
        speed += amount;
        showSpeed();
    }

    public void brake(int amount) {
        // or as ternary condition:
        // speed = (speed < amount) ? 0 : speed - amount;
        if (speed < amount) {
            speed = 0;
        } else {
            speed -= amount;
        }
        showSpeed();
    }

    private void showSpeed() {
        System.out.printf("%s is going %d miles per hour.%n", name, speed);
    }

    }

