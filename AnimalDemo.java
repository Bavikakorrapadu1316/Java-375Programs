package Inheritance.java;
class Animal {
    String name;
    int age;

    void displayAnimal() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Dog extends Animal {
    String breed;
    String color;

    void displayDog() {
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
    }
}

class Cat extends Animal {
    String breed;
    String color;

    void displayCat() {
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
    }
}

public class AnimalDemo {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.name = "Tommy";
        d.age = 4;
        d.breed = "Labrador";
        d.color = "Brown";

        d.displayAnimal();
        d.displayDog();

        System.out.println();

        Cat c = new Cat();
        c.name = "Kitty";
        c.age = 2;
        c.breed = "Persian";
        c.color = "White";

        c.displayAnimal();
        c.displayCat();
    }
}
