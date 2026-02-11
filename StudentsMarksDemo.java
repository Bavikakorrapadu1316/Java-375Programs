package Encapsulation;
class StudentMarks {
    private String name;
    private int rollNumber;
    private double marks;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getRollNumber() { return rollNumber; }
    public void setRollNumber(int rollNumber) { this.rollNumber = rollNumber; }

    public double getMarks() { return marks; }
    public void setMarks(double marks) { this.marks = marks; }
}

public class StudentsMarksDemo {
    public static void main(String[] args) {
        StudentMarks s = new StudentMarks();
        s.setName("Alice");
        s.setRollNumber(103);
        s.setMarks(88.5);
        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());
    }
}