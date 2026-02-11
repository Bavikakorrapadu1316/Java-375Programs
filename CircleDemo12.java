package Encapsulation;
public class CircleDemo12 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(7);
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Area: " + c.getArea());
    }
}