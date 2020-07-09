public class Main {
    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount("4D35J", 100);

        myAccount.deposit(-50);
        myAccount.deposit(50);
        myAccount.withdraw(500);
        myAccount.withdraw(75);
    }
}
