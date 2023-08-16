package arrays.varargs;

public class Main {

    public static void main(String... args) {

        System.out.println("Hello World again");

        String[] splitStrings = "Hello World again".split(" ");
        printText(splitStrings);
    }

    private static void printText(String[] textList) {

        for (String t : textList) {
            System.out.println(t);
        }
    }
}
