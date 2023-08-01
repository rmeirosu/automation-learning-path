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

        BankAccount accountOne = new BankAccount();

        accountOne.setAccountNumber("001");
        accountOne.setAccountBalance(5000.50);
        accountOne.setCustomerName("First Customer");
        accountOne.setCustomerEmail("first.customer@email.com");
        accountOne.setCustomerPhone("1234");

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


    }

}
