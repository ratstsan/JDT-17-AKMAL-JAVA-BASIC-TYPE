package com.indivaragroup.activity;

import dto.Task;
import logic.TaskLogic;

import java.util.ArrayList;

public class ToDoList {

    public static void main(String[] args) {

        ArrayList<Task> tasks = new ArrayList<>();

        tasks.add(new Task(
                "Backend API",
                "Akmal",
                "DONE",
                10,
                8,
                40
        ));

        tasks.add(new Task(
                "Frontend UI",
                "Akmal",
                "IN_PROGRESS",
                12,
                6,
                30
        ));

        tasks.add(new Task(
                "Testing",
                "Budi",
                "OPEN",
                8,
                0,
                30
        ));

        // Print task
        for (Task task : tasks) {

            System.out.println("==========");
            System.out.println("Task : " + task.title);

            System.out.println("Progress : "
                    + TaskLogic.getProgress(task) + "%");

            System.out.println("Variance : "
                    + TaskLogic.getVariance(task));

            System.out.println("Productivity : "
                    + String.format("%.2f",
                    TaskLogic.getProductivity(task)) + "%");
        }

        // Project progress
        System.out.println("\n=== PROJECT ===");

        System.out.println("Project Progress : "
                + String.format("%.2f",
                TaskLogic.getProjectProgress(tasks)) + "%");

        // Workload
        System.out.println("Workload Akmal : "
                + TaskLogic.getWorkload(tasks, "Akmal")
                + " jam");
    }
}