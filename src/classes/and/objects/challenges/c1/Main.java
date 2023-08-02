package classes.and.objects.challenges.c1;

/*
Classes Challenge Exercise

1. Create a new class for a bank account

2. Create fields for account characteristics like:
    -account number
    -account balance
    -customer name
    -email
    -phone number

3. Create getters and setters for each field.

4. Create two additional methods:
    -one for depositing funds into the account
    -one for withdrawing funds from the account

5. A customer should not be allowed to withdraw funds, if that withdrawal takes their balance negative.

6. Create a new project called ClassesChallenge, with the usual Main class with the usual main method.
You'll create an instance of an Account class, and then test your withdrawal and deposit methods.
You'll print information to the console, that confirms what the balance is after the methods are called.
 */
public class Main {

    public static void main(String[] args) {

//        BankAccount accountOne = new BankAccount("001", 5205.50,
//                "First Customer", "first.customer@email.com",
//                "1234");

        BankAccount accountOne = new BankAccount();
        BankAccount accountTwo = new BankAccount("Customer Two",
                "customer2@email.com","222-222-2222");

        System.out.println(accountOne.getAccountNumber());
        System.out.println(accountOne.getAccountBalance());

        System.out.println();
        System.out.println("This is accountTwo: ");
        System.out.println(accountTwo.getAccountNumber());
        System.out.println(accountTwo.getAccountBalance());
        System.out.println(accountTwo.getCustomerName());
        System.out.println(accountTwo.getCustomerEmail());
        System.out.println(accountTwo.getCustomerPhone());
        System.out.println();

//        accountOne.setAccountNumber("001");
//        accountOne.setAccountBalance(5000.50);
//        accountOne.setCustomerName("First Customer");
//        accountOne.setCustomerEmail("first.customer@email.com");
//        accountOne.setCustomerPhone("1234");

        System.out.println("Hello, " + accountOne.getCustomerName());
        System.out.println("Your Account Number is: " + accountOne.getAccountNumber());
        System.out.println("Your Account Balance is: " + accountOne.getAccountBalance());
        System.out.println();

        accountOne.depositFunds(1000.99);
        System.out.println();

        accountOne.withdrawFunds(3999.99);
        System.out.println();
        accountOne.withdrawFunds(9293.54);
        System.out.println();

        //////////////////////////////////////////////////////////////////////////////////

        // Simple Calculator challenge
        System.out.println("===Simple Calculator Challenge===");
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
        System.out.println();

        // Person challenge
        System.out.println("===Person Challenge===");
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
        System.out.println();


    }

}
