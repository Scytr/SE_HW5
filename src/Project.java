import java.util.ArrayList;

public class Project {
    private Course course;
    private String name;
    private ArrayList<Student> students;

    public Project(Course course, String name) {
        this.course = course;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public void addMember(Student student) {
        students.add(student);
    }

    public Student[] getMembers() {
        return students.toArray(new Student[students.size()]);
    }
}
