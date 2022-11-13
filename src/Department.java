import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Course> courses;
    private ArrayList<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
        this.employees = new ArrayList<>();
    }

    public Department() {
        this("Unknown");
    }

    public boolean addCourse(Course course) {
        return this.courses.add(course);
    }

    public boolean removeCourse(Course course) {
        return this.courses.remove(course);
    }

    public Employee[] getEmployees() {
        return this.employees.toArray(new Employee[employees.size()]);
    }

    public boolean addEmployee(Employee employee) {
        return this.employees.add(employee);
    }

    public boolean removeEmployee(Employee employee) {
        return this.employees.remove(employee);
    }

    public Course[] getCourses() {
        return this.courses.toArray(new Course[courses.size()]);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
