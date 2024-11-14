import java.util.Scanner;

public class ATMSystem {

    // BankAccount class to represent the user's bank account
    static class BankAccount {
        private double balance;

        // Constructor to initialize the account with an initial balance
        public BankAccount(double initialBalance) {
            if (initialBalance >= 0) {
                this.balance = initialBalance;
            } else {
                System.out.println("Initial balance cannot be negative.");
            }
        }

        // Deposit method
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: $" + amount);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        // Withdraw method
        public boolean withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: $" + amount);
                return true;
            } else if (amount > balance) {
                System.out.println("Insufficient funds for withdrawal.");
                return false;
            } else {
                System.out.println("Invalid withdrawal amount.");
                return false;
            }
        }

        // Check balance method
        public double getBalance() {
            return balance;
        }
    }

    // ATM class to handle the user interface and interactions
    static class ATM {
        private BankAccount account;

        // Constructor to initialize ATM with a bank account
        public ATM(BankAccount account) {
            this.account = account;
        }

        // Show ATM menu
        public void showMenu() {
            Scanner scanner = new Scanner(System.in);
            int option;

            do {
                // Display menu options
                System.out.println("\n--- ATM Menu ---");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                option = scanner.nextInt();

                switch (option) {
                    case 1:
                        checkBalance();
                        break;
                    case 2:
                        deposit(scanner);
                        break;
                    case 3:
                        withdraw(scanner);
                        break;
                    case 4:
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } while (option != 4);

            scanner.close();
        }

        // Check balance method
        private void checkBalance() {
            System.out.println("Current Balance: $" + account.getBalance());
        }

        // Deposit method
        private void deposit(Scanner scanner) {
            System.out.print("Enter amount to deposit: ");
            double amount = scanner.nextDouble();
            account.deposit(amount);
        }

        // Withdraw method
        private void withdraw(Scanner scanner) {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();
            account.withdraw(amount);
        }
    }

    // Main method to run the ATM system
    public static void main(String[] args) {
        // Create a BankAccount object with an initial balance
        BankAccount account = new BankAccount(500.0);  // Initial balance is $500

        // Create an ATM object that uses the BankAccount object
        ATM atm = new ATM(account);

        // Show ATM menu for the user to interact with
        atm.showMenu();
    }
}
