public class Question {
    private String task;
    private int maxValue;
    private int id;

    public Question(int id, String task, int value) {
        this.task = task;
        this.maxValue = value;
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getId() {
        return id;
    }
}
