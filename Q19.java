package Inheritance.java;
class Animal3 {
    String name;
    String animalType;
}

class Dog3 extends Animal3 {
    String breed;
}

class Cat3 extends Animal3 {
    String color;
}

public class Q19 {
    public static void main(String[] args) {
        Dog3 d = new Dog3();
        d.name = "Buddy";
        d.animalType = "Dog";
        d.breed = "Labrador";

        Cat3 c = new Cat3();
        c.name = "Kitty";
        c.animalType = "Cat";
        c.color = "White";

        System.out.println(d.name + " " + d.animalType + " " + d.breed);
        System.out.println(c.name + " " + c.animalType + " " + c.color);
    }
}
