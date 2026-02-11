package Encapsulation;
class Employee {
    private String name;
    private int id;
    private double salary;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}

public class EmployeeDemo13 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Charlie");
        e.setId(123);
        e.setSalary(50000);
        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
    }
 }
    