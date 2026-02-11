package Encapsulation;
public class ComputerDemo20 {
    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.setBrand("HP");
        comp.setModel("Pavilion");
        comp.setPrice(55000);
        System.out.println("Brand: " + comp.getBrand());
        System.out.println("Price: " + comp.getPrice());
    }
}