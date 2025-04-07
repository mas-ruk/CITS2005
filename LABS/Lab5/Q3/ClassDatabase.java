import java.util.ArrayList;

public class ClassDatabase {
    
    private class Student {
        private String name;
        private String classID;

        public Student(String name, String classID) {
            this.name = name;
            this.classID = classID;
        }
    }

    private ArrayList<Student> list;

    public ClassDatabase() {
        list = new ArrayList<Student>();
    }
    
    public void addCourseStudent(String student, String course) {
        list.add(new Student(student, course));
    }

    public int countStudents(String course) {
        int count = 0;
        for (Student student : list) {
            if (student.classID.equals(course)) {
                count++;
            } 
        }
        return count;
    }

    public static void main(String[] args) {
        ClassDatabase db = new ClassDatabase();
        db.addCourseStudent("Alan Turing", "CITS2005");
        db.addCourseStudent("Alan Turing", "CITS2200");
        db.addCourseStudent("Max", "CITS9999");
        db.addCourseStudent("Gozz", "CITS9999");
        db.addCourseStudent("Jane Doe", "CITS2005");
        System.out.println(db.countStudents("CITS2005"));
        System.out.println(db.countStudents("CITS2200"));
        System.out.println(db.countStudents("CITS9999"));
    }
}