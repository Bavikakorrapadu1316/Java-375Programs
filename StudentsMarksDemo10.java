package Encapsulation;
public class StudentsMarksDemo10 {
    public static void main(String[] args) {
        StudentMarks s = new StudentMarks();
        s.setName("Bob");
        s.setRollNumber(104);
        s.setMarks(92);
        System.out.println("Roll: " + s.getRollNumber());
        System.out.println("Marks: " + s.getMarks());
    }
}