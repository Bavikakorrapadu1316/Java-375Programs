package Inheritance.java;
class Person3 {
    String name;
    int age;
}

class Employee2 extends Person {
    int id;
    double salary;
}

public class Q21 {
    public static void main(String[] args) {
        Employee2 e = new Employee2();
        e.name = "Suresh";
        e.age = 30;
        e.id = 201;
        e.salary = 40000;

        System.out.println(e.name);
        System.out.println(e.age);
        System.out.println(e.id);
        System.out.println(e.salary);
    }
}
