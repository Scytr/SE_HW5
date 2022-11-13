import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private Project project;
    private ArrayList<Course> courses;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.project = null;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }
}
