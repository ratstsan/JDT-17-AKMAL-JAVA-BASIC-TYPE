package org.example.dto;

import java.time.LocalDate;

public class TaskDTO {
    private String taskId;
    private String project;
    private String title;
    private String description;
    private String assignee;
    private String priority;
    private String status; // Open, In Progress, Ready Review, Done, Cancelled
    private LocalDate startDate;
    private LocalDate dueDate;
    private double estimatedHour;
    private double actualHour;
    private double weight;
    private String reviewer;
    private String createdBy;

    // Constructor
    public TaskDTO(String taskId, String project, String title, String assignee,
                   String status, LocalDate dueDate, double estimatedHour,
                   double actualHour, double weight) {
        this.taskId = taskId;
        this.project = project;
        this.title = title;
        this.assignee = assignee;
        this.status = status;
        this.dueDate = dueDate;
        this.estimatedHour = estimatedHour;
        this.actualHour = actualHour;
        this.weight = weight;
    }

    // Getter dan Setter
    public String getTaskId() { return taskId; }
    public String getProject() { return project; }
    public String getTitle() { return title; }
    public String getAssignee() { return assignee; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public LocalDate getDueDate() { return dueDate; }
    public double getEstimatedHour() { return estimatedHour; }
    public double getActualHour() { return actualHour; }
    public double getWeight() { return weight; }
}