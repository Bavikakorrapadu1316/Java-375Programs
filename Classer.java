package Inheritance.java;
class A {
    int x = 10;
}

class B extends A {
    int y = 20;
}

public class Classer {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.x);
        System.out.println(obj.y);
    }
}
