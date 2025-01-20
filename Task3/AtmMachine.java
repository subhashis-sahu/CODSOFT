import java.util.Scanner;

public class AtmMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BankAccount userAccount = new BankAccount(2000.00);
        ATM atm = new ATM(userAccount);

        
        System.out.println("Choose OPTION !!!");
        System.out.println("1) WITHDRAWAL");
        System.out.println("2) DEPOSIT");
        System.out.println("3) CHECK BALANCE");
        System.out.println("4) EXIT");

        int num;

        do {
            num = input.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Enter amount to Withdraw:");
                    double withdrawAmount = input.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to Deposit:");
                    double depositAmount = input.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid Option! Please try again.");
                    break;
            }
        } while (num != 4);
        
        input.close();
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Cash deposit successful. Current balance: $" + balance);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: $" + balance);
        } else {
            System.out.println("Invalid amount for withdrawal.");
        }
    }
}

class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void checkBalance() {
        System.out.println("Your current balance is: $" + account.getBalance());
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }
}
