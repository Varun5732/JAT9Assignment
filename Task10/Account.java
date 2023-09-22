package tasks;
public class Account {
    private double balance;

    // Constructor to initialize the balance
    public Account(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative.");
        }
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + this.balance);
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawn $" + amount + ". New balance: $" + this.balance);
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return this.balance;
    }

    public static void main(String[] args) {
        // Example usage of the Account class
        Account myAccount = new Account(3000.0);
        System.out.println("Initial balance: $" + myAccount.getBalance());

        myAccount.deposit(500.0);
        myAccount.withdraw(200.0);
        myAccount.withdraw(1500.0); // This will fail due to insufficient balance
    }
}
