import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public double checkBalance() {
        return balance;
    }

    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + checkBalance());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String accountNumber = scanner.nextLine();
        String accountHolderName = scanner.nextLine();
        double initialBalance = scanner.nextDouble();

        BankAccount account =
                new BankAccount(accountNumber, accountHolderName, initialBalance);

        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        double withdrawalAmount = scanner.nextDouble();
        account.withdraw(withdrawalAmount);

        account.displayAccount();
        scanner.close();
    }
}