package Inheritance.java;
class Anima {
    String name;
    String type;

    Anima(String name, String type) {
        this.name = name;
        this.type = type;
    }

    void showAnimal() {
        System.out.println("Animal: " + name + " (" + type + ")");
    }
}

class Bird extends Anima {
    String color;
    double wingspan;

    Bird(String name, String type, String color, double wingspan) {
        super(name, type);
        this.color = color;
        this.wingspan = wingspan;
    }

    void showBird() {
        System.out.println("Bird: " + name + " (" + type + "), Color: " + color + ", Wingspan: " + wingspan + " meters");
    }
}

public class Main27 {
    public static void main(String[] args) {
        Anima a = new Anima("Lion", "Mammal");
        a.showAnimal();

        Bird b = new Bird("Parrot", "Bird", "Green", 0.25);
        b.showBird();
    }
}
