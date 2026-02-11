package Inheritance.java;
class Animal4 {
    String name;
    String type;
}

class Dog4 extends Animal4 {
    String breed;
}

class Cat4 extends Animal4 {
    String color;
}

public class Q20 {
    public static void main(String[] args) {
        Dog4 d = new Dog4();
        d.name = "Buddy";
        d.breed = "Labrador";

        Cat4 c = new Cat4();
        c.name = "Kitty";
        c.color = "White";

        System.out.println(d.name);
        System.out.println(c.name);
    }
}
