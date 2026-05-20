package dto;

public class Task {

    public String title;
    public String assignee;
    public String status;

    public int estimatedHour;
    public int actualHour;
    public int weight;

    public Task(String title, String assignee, String status,
                int estimatedHour, int actualHour, int weight) {

        this.title = title;
        this.assignee = assignee;
        this.status = status;
        this.estimatedHour = estimatedHour;
        this.actualHour = actualHour;
        this.weight = weight;
    }
}