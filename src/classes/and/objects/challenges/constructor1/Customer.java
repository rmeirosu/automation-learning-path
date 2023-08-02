package classes.and.objects.challenges.constructor1;

public class Customer {
    /*
    1. Create a new Class called Customer, with 3 fields:
        -name
        -credit limit
        -email address
     */
    private String name;
    private double creditLimit;
    private String emailAddress;

    //2. Create the getter methods only, for each field. You don't need to create the setters.
    public String getCustomerName() {
        return this.name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    /*
    3. Create 3 constructors for this class:
        -First, create a constructor for all three fields which should assign the arguments directly to the instance fields.
        -Second, create a no-args constructor that calls another constructor, passing some literal values for each argument.
        -Third, create a constructor with just the name and email parameters, which also calls another constructor.
    */
    public Customer(String name, double creditLimit, String emailAddress) { // constructor for all 3 fields
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public Customer() { // no-args constructor that calls another constructor, passing some literal values for each argument.
        this("Default Name", 001, "Default eMail");
    }

    public Customer(String name, String emailAddress) { // constructor with just the name and email parameters, which also calls another constructor.
        this(name, 50000, emailAddress);

    }
}
