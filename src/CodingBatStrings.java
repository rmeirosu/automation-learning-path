public class CodingBatStrings {

    public static void main(String[] args) {

        // helloName
        System.out.println("CodingBat String-1 exercise: helloName");
        System.out.println(helloName("Bob"));
        System.out.println(helloName("Alice"));
        System.out.println(helloName("X"));
        System.out.println(helloName("Dolly"));
        System.out.println(helloName("Alpha"));
        System.out.println(helloName("Omega"));
        System.out.println(helloName("Goodbye"));
        System.out.println(helloName("ho ho ho"));
        System.out.println(helloName("xyz!"));
        System.out.println(helloName("Hello"));
        System.out.println("============");

        // makeAbba
        System.out.println("CodingBat String-1 exercise: makeAbba");
        System.out.println(makeAbba("Hi", "Bye"));
        System.out.println(makeAbba("Yo", "Alice"));
        System.out.println(makeAbba("What", "Up"));
        System.out.println("============");

        // makeTags
        System.out.println("CodingBat String-1 exercise: makeTags");
        System.out.println(makeTags("i", "Yay"));
        System.out.println(makeTags("i", "Hello"));
        System.out.println(makeTags("cite", "Yay"));
        System.out.println("============");


    }

    public static String helloName(String name) {
    // Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
        return "Hello " + name + "!";
    }

    public static String makeAbba(String a, String b) {
    /*
    Given two strings, a and b, return the result of putting them together in the order abba,
    e.g. "Hi" and "Bye" returns "HiByeByeHi".
     */
        return a + b + b + a;
    }

    public static String makeTags(String tag, String word) {
    /*
    The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
    In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
    Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
     */
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

}
