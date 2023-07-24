public class W3SchoolJavaTypeCasting {
    //Type casting is when you assign a value of one primitive data type to another type.
    public static void main(String[] args) {
        Casting wide = new Casting("wideningCasting");
        Casting narrow = new Casting("narrowingCasting");

        wide.widening();
        narrow.narrowing();

    }

    static class Casting {
        public Casting(String castName){
            String name;
            name = castName;

        }
        public void widening() {
        /*
        Widening Casting (automatically) - converting a smaller type to a larger type size:
        byte -> short -> char -> int -> long -> float -> double.
        Widening casting is done automatically when passing a smaller size type to a larger size type:
        */
            int myInt = 9;
            double myDouble = myInt; //Automatic casting int to double

            System.out.println("Widening casting - myInt is: " + myInt);
            System.out.println("Widening casting - myDouble is:" + myDouble);
        }

        public void narrowing() {
        /*
        Narrowing Casting (manually) - converting a larger type to a smaller size type:
        double -> float -> long -> int -> char -> short -> byte.
        Narrowing casting must be done manually by placing the type in parentheses in front of the value:
         */
            double myDouble = 9.78;
            int myInt = (int) myDouble; //Manual casting double to int

            System.out.println("Narrowing casting - myDouble is:" + myDouble);
            System.out.println("Narrowing casting - myInt is: " + myInt);
        }

    }
}


