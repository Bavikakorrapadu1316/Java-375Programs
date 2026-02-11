package Encapsulation;
public class StudentDemo2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Jane");
        s.setRollNumber(102);
        s.setAge(21);
        System.out.println("Name: " + s.getName());
        System.out.println("Roll: " + s.getRollNumber());
        System.out.println("Age: " + s.getAge());
    }
}