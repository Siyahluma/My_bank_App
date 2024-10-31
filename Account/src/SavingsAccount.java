public class SavingsAccount extends Account {
    private double interestRate;


    public SavingsAccount(double balance, int accountNumber, double interestRate) {
        super(balance, accountNumber);
        this.interestRate = interestRate;
    }

   
    public void addInterest() {
        balance += balance * interestRate;
        System.out.println("Interest added.");
    }


    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds in savings account.");
        } else {
            balance -= amount;
            System.out.println("Withdrew: R" + amount+", your new balance is: R"+balance);
        }
    }
}
