package Inheritance.java;
class Anim {
    String name;
    String type;

    Anim(String name, String type) {
        this.name = name;
        this.type = type;
    }
}

class Bir extends Anim {
    String color;

    Bir(String name, String type, String color) {
        super(name, type);
        this.color = color;
    }
}

public class Main28 {
    public static void main(String[] args) {
        Anim a = new Anim("Elephant", "Mammal");
        System.out.println("Animal: " + a.name + " (" + a.type + ")");

        Bir b = new Bir("Sparrow", "Bird", "Brown");
        System.out.println("Bird: " + b.name + " (" + b.type + "), Color: " + b.color);
    }
}
