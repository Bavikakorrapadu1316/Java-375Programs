package Encapsulation;
class BankAccount {
    private String accountNumber;
    private double balance;

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { balance -= amount; }
}

public class BankAccountDemo3 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setAccountNumber("12345");
        acc.setBalance(1000);
        acc.deposit(500);
        System.out.println("Balance: " + acc.getBalance());
    }
}