import java.util.Random;
import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Account credit = new CheckingAccount(5000, 101); 
        Account savings = new SavingsAccount(1000, 102, 0.02); 

        System.out.println("Welcome to ABSA BANK");
        boolean exit = false;

        while (!exit) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Deposit to Credit");
            System.out.println("2. Withdraw from Credit");
            System.out.println("3. Deposit to Savings");
            System.out.println("4. Withdraw from Savings");
            System.out.println("5. Show Balances");
            System.out.println("6. Add Interest to Savings");
            System.out.println("7. Withdraw Money with PIN");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount for Credit: R");
                    double depositAmount = scanner.nextDouble();
                    credit.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount for Credit: R");
                    double withdrawAmount = scanner.nextDouble();
                    credit.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.print("Enter deposit amount for Savings: R");
                    depositAmount = scanner.nextDouble();
                    savings.deposit(depositAmount);
                    break;
                case 4:
                    System.out.print("Enter withdrawal amount for Savings: R");
                    withdrawAmount = scanner.nextDouble();
                    savings.withdraw(withdrawAmount);
                    break;
                case 5:
                    System.out.print("Credit Account Balance: ");
                    credit.displayBalance();
                      System.out.println("======================================");
                    System.out.print("Savings Account Balance: ");
                    savings.displayBalance();
                    break;
                case 6:
                    if (savings instanceof SavingsAccount) {
                        ((SavingsAccount) savings).addInterest();
                    }
                    break;
                case 7:
                    withdrawWithPin(scanner, credit); 
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
        scanner.close();
        System.out.println("Thank you for using the ABSA Bank!");
    }

    
    private static void withdrawWithPin(Scanner scanner, Account account) {
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();

       
        int pin = generatePin();
        System.out.println("Your generated PIN is: " + pin);

        
        account.withdraw(amount);
    }

    
    private static int generatePin() {
        Random random = new Random();
        return 1000 + random.nextInt(9000); 
    }
}