package classes.and.objects.part2.encapsulation_challenge;

public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer(50, true);
        System.out.println("initial page count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPages(10);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", pagesPrinted, printer.getPagesPrinted());

        Printer printer2 = new Printer(50, false);
        System.out.println("initial page count = " + printer2.getPagesPrinted());

        int pagesPrinted2 = printer2.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", pagesPrinted, printer2.getPagesPrinted());

        pagesPrinted2 = printer2.printPages(10);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", pagesPrinted, printer2.getPagesPrinted());

    }
}
