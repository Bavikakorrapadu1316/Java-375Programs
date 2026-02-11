package Inheritance.java;
class Parent {
    int a = 10;
}

class Child extends Parent {
    int b = 20;

    void show() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

public class InheritanceAccessDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
