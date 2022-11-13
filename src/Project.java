import java.util.ArrayList;

public class Project {
    private Course course;
    private String name;
    private ArrayList<Student> members;

    public Project(Course course, String name) {
        this.course = course;
        this.name = name;
        this.members = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void addMember(Student student) {
        members.add(student);
    }

    public Student[] getMembers() {
        return members.toArray(new Student[members.size()]);
    }
}
