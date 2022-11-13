import java.util.ArrayList;

public class Professor extends Employee {
    private ArrayList<Course> courses;
    private ArrayList<Exam> exams;

    public Professor(Department department, String name, int employeeId) {
        super(department, name, employeeId);
        this.courses = new ArrayList<>();
        this.exams = new ArrayList<>();
    }

    public Professor() {
        this(new Department(), "Unknown", -1);
    }

    public void publicCourse() {
        // TODO: ??? Maybe getCourse?
    }

    public void assignTA() {
        // TODO: Unclear which TA to assign to which course
    }

    public void addCourse() { // TODO: Missing reference to course
        this.courses.add(new Course());
    }
}
