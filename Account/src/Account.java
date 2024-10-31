public class Account {
    protected double balance;
    protected int accountNumber;

    public Account(double balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: R" + amount+", balance is: R"+balance);
        } else {
            System.out.println("Amount not positive.");
        }
    }

   
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("Withdrew: R" + amount+", balance is: R"+balance);
        }
    }

    public void displayBalance() {
        System.out.println("Balance: R" + balance);
    }
}
