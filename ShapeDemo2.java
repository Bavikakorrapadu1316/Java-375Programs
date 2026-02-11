package Inheritance.java;
class Shape9 {
    String type;
    String color;

    Shape9(String type, String color) {
        this.type = type;
        this.color = color;
    }

    void display() {
        System.out.println("Shape Type: " + type);
        System.out.println("Shape Color: " + color);
    }
}

public class ShapeDemo2 {
    public static void main(String[] args) {
        Shape9 shape = new Shape9("Rectangle", "Blue");
        shape.display();
    }
}