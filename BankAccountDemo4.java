package Encapsulation;
public class BankAccountDemo4 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setAccountNumber("67890");
        acc.setBalance(2000);
        acc.withdraw(300);
        System.out.println("Balance: " + acc.getBalance());
    }
}