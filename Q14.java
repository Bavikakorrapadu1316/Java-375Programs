package Inheritance.java;
class Shape {
    String type;
    String color;
}

class Triangle extends Shape {
    int base;
    int height;
}

public class Q14 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.type = "Triangle";
        t.color = "Red";
        t.base = 10;
        t.height = 5;

        System.out.println(t.type);
        System.out.println(t.base);
    }
}
