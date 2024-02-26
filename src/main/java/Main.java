import org.students.HighSchoolStudent;
import org.students.Student;
import org.students.StudentManagementSystem;

public class Main {
    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();

        Student alice = new HighSchoolStudent("Alice", 16, "Math", 10);
        system.addStudent(alice);
        system.displayAllStudents();
    }
}
