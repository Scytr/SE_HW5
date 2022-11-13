import java.util.ArrayList;

public class Course {
    private int id;
    private String name;
    private int maxCapacity;
    private boolean isFull; // TODO: Remove redundant
    private ArrayList<Professor> professors;
    private ArrayList<TA> tas;
    private ArrayList<Student> students;
    private ArrayList<Exam> exams;
    private ArrayList<Project> projects;

    public Course(int id, String name, int capacity, Professor professor, Exam exam) {
        this.id = id;
        this.name = name;
        this.maxCapacity = capacity;

        professors = new ArrayList<>();
        tas = new ArrayList<>();
        students = new ArrayList<>();
        exams = new ArrayList<>();
        projects = new ArrayList<>();

        exams.add(exam);
    }

    public Course() {
        this(-1, "Unknown", -1, new Professor(), new Exam());
    }

    public void enroll(Student student) {
        if(students.contains(student))
            return;
        // TODO: Check if student is eligible to enroll
        students.add(student);
        student.addCourse(this);
    }

    public void apply(TA ta) {
        // TODO: Do something
    }

    public void setMaxCap(int max) { // TODO: Bad naming convention either rename cap in constructor to max or other way
        this.maxCapacity = max;
    }

    public TA getTA() {
        // TODO: Change return value: Not clear what should be returned
        return tas.get(0);
    }

    public void setTA(TA ta) {
        tas.add(ta);
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor getProf() {
        return professors.get(0);
    }

    public boolean addProf(Professor professor) {
        if(professors.size() >= 3) {
            throw new UnsupportedOperationException("Can't have more than 3 Professors per Course");
        }

        return professors.add(professor);
    }

    public boolean removeProf(Professor professor) {
        return professors.remove(professor);
    }
}
