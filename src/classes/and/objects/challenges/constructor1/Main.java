package classes.and.objects.challenges.constructor1;

/*
1. Create a new Class called Customer, with 3 fields:
    -name
    -credit limit
    -email address

2. Create the getter methods only, for each field. You don't need to create the setters.

3. Create 3 constructors for this class:
    -First, create a constructor for all three fields which should assign the arguments directly to the instance fields.
    -Second, create a no-args constructor that calls another constructor, passing some literal values for each argument.
    -Third, create a constructor with just the name and email parameters, which also calls another constructor.
 */

public class Main {
    public static void main(String[] args) {

        Customer customerOne = new Customer("Customer One",
                100000, "customer.one@email.com");
        System.out.println("This is customerOne: ");
        System.out.println(customerOne.getCustomerName());
        System.out.println(customerOne.getCreditLimit());
        System.out.println(customerOne.getEmailAddress());
        System.out.println();

        Customer customerTwo = new Customer();
        System.out.println("This is customerTwo: ");
        System.out.println(customerTwo.getCustomerName());
        System.out.println(customerTwo.getCreditLimit());
        System.out.println(customerTwo.getEmailAddress());
        System.out.println();

        Customer customerThree = new Customer("Customer Three", "customer.three@email.com");
        System.out.println("This is customerThree: ");
        System.out.println(customerThree.getCustomerName());
        System.out.println(customerThree.getCreditLimit());
        System.out.println(customerThree.getEmailAddress());
        System.out.println();
    }
}
