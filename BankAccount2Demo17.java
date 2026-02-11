package Encapsulation;
class BankAccount2 {
    private String accountNumber;
    private double balance;

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public double getBalance() { return balance; }
    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { if (amount <= balance) balance -= amount; }
}

public class BankAccount2Demo17 {
    public static void main(String[] args) {
        BankAccount2 acc = new BankAccount2();
        acc.setAccountNumber("67890");
        acc.deposit(1000);
        acc.withdraw(300);
        System.out.println("Balance: " + acc.getBalance());
    }
}