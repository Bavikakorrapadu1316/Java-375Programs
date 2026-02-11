package Inheritance.java;
class Person4 {
    String name;
    int age;
}

class Employee4 extends Person4 {
    int id;
    double salary;
}

public class Q22 {
    public static void main(String[] args) {
        Employee4 e = new Employee4();
        e.name = "Suresh";
        e.id = 201;

        System.out.println(e.name);
        System.out.println(e.id);
    }
}
