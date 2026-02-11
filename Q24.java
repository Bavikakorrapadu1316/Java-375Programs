package Inheritance.java;
class Shape5 {
    String type;
    String color;
}

class Rectangle5 extends Shape5 {
    int length;
    int width;
}

public class Q24 {
    public static void main(String[] args) {
        Rectangle5 r = new Rectangle5();
        r.type = "Rectangle";
        r.length = 10;
        r.width = 5;

        System.out.println(r.type);
        System.out.println(r.length);
    }
}
