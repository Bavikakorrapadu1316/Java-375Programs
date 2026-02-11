package Inheritance.java;
class BankAccount {
    int accNo;
    double balance;
}

class SavingsAccount extends BankAccount {
    double interest;
}

class CurrentAccount extends BankAccount {
    double overdraft;
}

public class Q11 {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.accNo = 101;
        s.balance = 20000;
        s.interest = 5.5;

        CurrentAccount c = new CurrentAccount();
        c.accNo = 102;
        c.balance = 50000;
        c.overdraft = 10000;

        System.out.println(s.accNo + " " + s.balance);
        System.out.println(c.accNo + " " + c.balance);
    }
}
