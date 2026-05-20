package org.example.service;

import org.example.dto.TaskDTO;
import java.time.LocalDate;
import java.util.ArrayList;

public class TaskService {

    // 4.1 & 5.5 Progress Berdasarkan Status
    public double getProgressByStatus(TaskDTO task) {
        String status = task.getStatus().toUpperCase();
        switch (status) {
            case "OPEN": return 0.0; [cite: 14]
            case "IN PROGRESS": return 50.0; [cite: 15]
            case "READY REVIEW": return 80.0; [cite: 16]
            case "DONE": return 100.0; // Rule 5: Otomatis 100% [cite: 18, 56]
            case "CANCELLED": return 0.0; // Rule 3: Tidak dihitung [cite: 19, 54]
            default: return 0.0;
        }
    }

    // 4.3 Progress Project Berdasarkan Bobot Task
    public double calculateProjectProgress(ArrayList<TaskDTO> tasks) {
        double totalWeightAll = 0;
        double totalWeightDone = 0;

        for (TaskDTO task : tasks) {
            if (task.getStatus().equalsIgnoreCase("CANCELLED")) {
                continue; // Rule 3: Cancelled diabaikan [cite: 19, 54]
            }

            totalWeightAll += task.getWeight(); [cite: 29]

            // Rumus Rekomendasi MVP: Progress Bobot Task x Status Percentage
            double progressPercentage = getProgressByStatus(task) / 100.0; [cite: 61]
            totalWeightDone += (task.getWeight() * progressPercentage); [cite: 34, 35, 61]
        }

        if (totalWeightAll == 0) return 0.0;
        return (totalWeightDone / totalWeightAll) * 100.0; [cite: 29]
    }

    // 4.4 Workload Assignee (Task Aktif: Open, In Progress, Ready Review)
    public double calculateAssigneeWorkload(ArrayList<TaskDTO> tasks, String assigneeName) {
        double totalWorkload = 0;

        for (TaskDTO task : tasks) {
            if (task.getAssignee().equalsIgnoreCase(assigneeName)) {
                String status = task.getStatus().toUpperCase();
                // Hanya hitung task yang aktif [cite: 38, 40]
                if (status.equals("OPEN") || status.equals("IN PROGRESS") || status.equals("READY REVIEW")) { [cite: 40]
                    totalWorkload += task.getEstimatedHour(); [cite: 39]
                }
            }
        }
        return totalWorkload; [cite: 61]
    }

    // 4.5 Variance Estimasi vs Aktual (Actual - Estimated)
    public double calculateVariance(TaskDTO task) {
        return task.getActualHour() - task.getEstimatedHour(); [cite: 42, 43, 47]
    }

    // 4.6 Produktivitas Task (Estimated / Actual x 100)
    public double calculateProductivity(TaskDTO task) {
        if (task.getActualHour() == 0) return 0.0;
        return (task.getEstimatedHour() / task.getActualHour()) * 100.0; [cite: 49, 50]
    }

    // 5.6 Cek SLA Overdue
    public String checkSlaStatus(TaskDTO task) {
        // Jika melewati due date dan belum DONE, maka Overdue
        if (LocalDate.now().isAfter(task.getDueDate()) && !task.getStatus().equalsIgnoreCase("DONE")) { [cite: 57]
            return "OVERDUE"; [cite: 57]
        }
        return "NORMAL";
    }
}