package Inheritance.java;
class Shape1 {
    String type;
    String color;
}

class Triangle extends Shape1 {
    int base;
    int height;
}

public class Q13 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.type = "Triangle";
        t.color = "Red";
        t.base = 10;
        t.height = 5;

        System.out.println(t.type);
        System.out.println(t.color);
        System.out.println(t.base);
        System.out.println(t.height);
    }
}
