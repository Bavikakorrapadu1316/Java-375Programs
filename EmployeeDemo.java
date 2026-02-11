package Inheritance.java;
class Employ {
    String name;
    int id;
    double salary;

    Employ(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employ emp = new Employ("Alice", 123, 50000);
        emp.display();
    }
}