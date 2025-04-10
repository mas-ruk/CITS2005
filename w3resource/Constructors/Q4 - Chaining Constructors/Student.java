public class Student {
    private int studentID;
    private String studentName;
    private String grade;

    public Student() {
        // call parameterised constructor with default values
        this(0, "Unknown", "Unknown");
    }

    public Student(int studentID, String studentName, String grade) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.grade = grade;
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        // Create a new Student object using the default constructor
        Student student1 = new Student();
        // Print the values of the instance variables for student1
        System.out.println("Student1 ID: " + student1.studentID);
        System.out.println("Student1 Name: " + student1.studentName);
        System.out.println("Student1 Grade: " + student1.grade);

        // Create a new Student object using the parameterized constructor
        Student student2 = new Student(101, "Cullen", "A");
        // Print the values of the instance variables for student2
        System.out.println("Student2 ID: " + student2.studentID);
        System.out.println("Student2 Name: " + student2.studentName);
        System.out.println("Student2 Grade: " + student2.grade);
    }
}