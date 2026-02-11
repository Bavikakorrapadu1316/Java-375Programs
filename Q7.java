package Inheritance.java;
class Employee {
    String name;
    int id;
    double salary;
}

class Manager extends Employee {
    String department;
    String designation;
}

public class Q7 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Ravi";
        m.id = 101;
        m.salary = 50000;
        m.department = "IT";
        m.designation = "Manager";

        System.out.println(m.name);
        System.out.println(m.id);
        System.out.println(m.salary);
        System.out.println(m.department);
        System.out.println(m.designation);
    }
}
