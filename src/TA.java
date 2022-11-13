import java.util.ArrayList;

public class TA {
    private String name;
    public ArrayList<Course> courses;

    public TA(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public TA() {
        this("Unknown");
    }

    public Course[] getCourse() {
        // TODO: Not really clear what is to be returned getCourse implies singular Course, but which one? first?
        // TODO: Alternatively all courses could be returned
        return courses.toArray(new Course[courses.size()]);
    }

    public String getName() {
        return name;
    }

    public void extendContract(Course course) {

    }

    public void setName(String name) {
        this.name = name;
    }
}
