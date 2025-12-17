class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double Balance) {
        this.accountNumber = accountNumber;
        this.balance = Balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } 
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}

public class BankEncapsulation {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("12345", 1000);
        acc.deposit(500);
        acc.withdraw(200);
        System.out.println("Remaining Balance: " + acc.getBalance());
    }
}