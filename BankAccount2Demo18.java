package Encapsulation;
public class BankAccount2Demo18 {
    public static void main(String[] args) {
        BankAccount2 acc = new BankAccount2();
        acc.setAccountNumber("34567");
        acc.deposit(2000);
        acc.withdraw(500);
        System.out.println("Balance: " + acc.getBalance());
    }
}