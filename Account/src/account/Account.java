
public class Account {
    protected double balance;
    protected int accountNumber;

    // Constructor to initialize balance and account number
    public Account(double balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    // Deposit method to add money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method to be overridden in subclasses
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}
