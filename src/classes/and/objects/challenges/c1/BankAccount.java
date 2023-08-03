package classes.and.objects.challenges.c1;
/*
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
 */
public class BankAccount {
    /*
    2. Create fields for account characteristics like:
    -account number
    -account balance
    -customer name
    -email
    -phone number
     */
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public BankAccount() { // no-args constructor chain calling the arguments constructor
        this("001", 123.45,
                "Default name", "default email",
                "Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double accountBalance, String customerName, String customerEmail,
                       String customerPhone) { // constructor with parameters
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public BankAccount(String customerName, String customerEmail, String customerPhone) { // constructor with partial params
        this("9999",155.5, customerName, customerEmail, customerPhone);
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.customerPhone = customerPhone;
    }

    // 3. Create getters and setters for each field.
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    /*
    4. Create two additional methods:
        -one for depositing funds into the account
        -one for withdrawing funds from the account

    5. A customer should not be allowed to withdraw funds, if that withdrawal takes their balance negative.
     */

    public void depositFunds(double depositAmount) {

        System.out.println("You want to deposit " + depositAmount + " amount.");
        System.out.println("Please wait...");

        this.accountBalance += depositAmount;

        System.out.println("You have successfully deposited " + depositAmount + ".");
        System.out.println("Your Account Balance is now: " + accountBalance);
    }

    public void withdrawFunds(double withdrawAmount) {

        System.out.println("You want to withdraw " + withdrawAmount + " amount.");
        System.out.println("Please wait...");

        if (accountBalance - withdrawAmount < 0) {
            System.out.println("You cannot withdraw " + withdrawAmount + ".");
            System.out.println("Your balance will be negative!");

        } else {
            this.accountBalance -= withdrawAmount;

            System.out.println("You have successfully withdrawn " + withdrawAmount + " amount.");
            System.out.println("Your Account Balance is now: " + accountBalance);
        }
    }


}
