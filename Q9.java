package Inheritance.java;
class Person {
    String name;
    int age;
}

class Student extends Person {
    int rollNo;
}

class Teacher extends Person {
    String subject;
}

public class Q9 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Anu";
        s.age = 20;
        s.rollNo = 12;

        Teacher t = new Teacher();
        t.name = "Ramesh";
        t.age = 40;
        t.subject = "Java";

        System.out.println(s.name + " " + s.rollNo);
        System.out.println(t.name + " " + t.subject);
    }
}
