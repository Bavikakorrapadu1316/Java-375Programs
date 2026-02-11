package Inheritance.java;
class Base {
    void show() {
        System.out.println("This is base class method");
    }
}

class Derived extends Base {
    void display() {
        System.out.println("This is derived class method");
    }
}

public class BaseMethodDemo {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.show();      // base class method
        d.display();   // derived class method
    }
}
