
public class CheckingAccount extends Account {
    private double overdraftLimit = 1000; 

   
    public CheckingAccount(double balance, int accountNumber) {
        super(balance, accountNumber);
    }

    
    @Override
    public void withdraw(double amount) {
        if (amount > balance + overdraftLimit) {
            System.out.println(" limit exceeded.");
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        }
    }
}
