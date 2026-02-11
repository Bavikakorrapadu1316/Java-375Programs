package Inheritance.java;
class Emplo {
    String name;
    int id;
    double salary;

    Emplo(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

class Mana extends Emplo {
    String department;
    String designation;

    Mana(String name, int id, double salary, String department, String designation) {
        super(name, id, salary);
        this.department = department;
        this.designation = designation;
    }

    void displayManager() {
        displayEmployee();
        System.out.println("Department: " + department);
        System.out.println("Designation: " + designation);
    }
}

public class ManagerDemo {
    public static void main(String[] args) {
        Mana manager = new Mana("Bob", 456, 75000, "IT", "Senior Manager");
        manager.displayManager();
    }
}