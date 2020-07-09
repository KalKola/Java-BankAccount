public class Main {
    public static void main(String[] args) {

        // create new bank account with a balance of $100
        BankAccount myAccount = new BankAccount("4D35J", 100);

        // attempt to withdraw and deposit both valid and invalid amounts
        myAccount.deposit(-50);
        myAccount.deposit(50);
        myAccount.withdraw(500);
        myAccount.withdraw(75);
    }
}
