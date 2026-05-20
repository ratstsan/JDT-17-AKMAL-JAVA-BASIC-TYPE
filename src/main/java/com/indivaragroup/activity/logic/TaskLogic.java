package logic;

import dto.Task;

import java.util.ArrayList;

public class TaskLogic {

    // Progress berdasarkan status
    public static int getProgress(Task task) {

        switch (task.status) {

            case "OPEN":
                return 0;

            case "IN_PROGRESS":
                return 50;

            case "READY_REVIEW":
                return 80;

            case "DONE":
                return 100;

            default:
                return 0;
        }
    }

    // Variance
    public static int getVariance(Task task) {
        return task.actualHour - task.estimatedHour;
    }

    // Productivity
    public static double getProductivity(Task task) {

        if (task.actualHour == 0) {
            return 0;
        }

        return (double) task.estimatedHour / task.actualHour * 100;
    }

    // Workload assignee
    public static int getWorkload(ArrayList<Task> tasks, String assignee) {

        int total = 0;

        for (Task task : tasks) {

            boolean active =
                    task.status.equals("OPEN") ||
                            task.status.equals("IN_PROGRESS") ||
                            task.status.equals("READY_REVIEW");

            if (task.assignee.equalsIgnoreCase(assignee) && active) {
                total += task.estimatedHour;
            }
        }

        return total;
    }

    // Progress project berbobot
    public static double getProjectProgress(ArrayList<Task> tasks) {

        double totalWeight = 0;
        double totalProgress = 0;

        for (Task task : tasks) {

            if (task.status.equals("CANCELLED")) {
                continue;
            }

            totalWeight += task.weight;

            double progress =
                    task.weight * (getProgress(task) / 100.0);

            totalProgress += progress;
        }

        return totalProgress / totalWeight * 100;
    }
}