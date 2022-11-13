import java.util.ArrayList;

public class Exam {
    private int maxValue;
    private ArrayList<Question> questions;
    private ArrayList<Student> students;
    private Course course;

    public Exam() {
        this.maxValue = 0;
        this.questions = new ArrayList<>();
        this.students = new ArrayList<>();
        this.course = null;
    }

    public Exam(Question question) {
        this();

        this.addQuestion(question);
    }

    public Exam(ArrayList<Question> questions) {
        this();

        for(Question question : questions) {
            this.maxValue += question.getMaxValue();
        }
    }

    public boolean register(Student student) {
        if(this.students.contains(student)) {
            return false;
        }
        // TODO: Add checks if student is allowed to take Exam
        return this.students.add(student);
    }

    public void addQuestion(Question question) {
        maxValue += question.getMaxValue();
        questions.add(question);

        // TODO: Check for duplicate ids or tasks
    }

    public void addQuestion(int id, String task, int value) {
        this.addQuestion(new Question(id, task, value));
    }

    public Student[] getRegisteredStudents() {
        return students.toArray(new Student[students.size()]);
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public Question[] getQuestions() {
        return questions.toArray(new Question[questions.size()]);
    }
}
