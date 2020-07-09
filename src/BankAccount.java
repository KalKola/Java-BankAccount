public class BankAccount {

    // declare private variables for encapsulation
    private String accountNumber;
    private int accountBalance;

    // class constructor
    public BankAccount(String inputAccountNumber, int inputAccountBalance) {
        this.accountNumber = inputAccountNumber;
        this.accountBalance = inputAccountBalance;
        System.out.println("Account " + this.accountNumber + " created successfully with balance " + this.accountBalance);
    }

    // deposit function with appropriate error checking
    public void deposit(int depositAmount) {
        if(depositAmount <= 0) {
            System.out.println("Invalid deposit amount.");
        }
        else {
            this.accountBalance += depositAmount;
            System.out.println("New balance: $" + this.accountBalance);
        }
    }

    // withdraw function with appropriate error checking
    public void withdraw(int withdrawAmount) {
        if(withdrawAmount > this.accountBalance) {
            System.out.println("Withdraw amount exceeds account balance.");
        }
        else {
            this.accountBalance -= withdrawAmount;
            System.out.println("New balance: $" + this.accountBalance);
        }
    }
}
