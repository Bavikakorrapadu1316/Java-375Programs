package Inheritance.java;
class Person1 {
    String name;
    int age;
}

class Student1 extends Person {
    int rollNo;
}

class Teacher1 extends Person {
    String subject;
}

public class Q10 {
    public static void main(String[] args) {
        Student1 s = new Student1();
        s.name = "Anu";
        s.age = 20;
        s.rollNo = 12;

        Teacher1 t = new Teacher1();
        t.name = "Ramesh";
        t.age = 40;
        t.subject = "Java";

        System.out.println(s.name + " " + s.rollNo);
        System.out.println(t.name + " " + t.subject);
    }
}
