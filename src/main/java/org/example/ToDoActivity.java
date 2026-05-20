package org.example;

import org.example.dto.TaskDTO;
import org.example.service.TaskService;
import java.time.LocalDate;
import java.util.ArrayList;

public class ToDoActivity {

    public static void main(String[] args) {
        TaskService service = new TaskService();
        ArrayList<TaskDTO> listTasks = new ArrayList<>();

        // Simulasi input data project sesuai contoh dokumen (Halaman 2)
        // Format: TaskDTO(ID, Project, Title, Assignee, Status, DueDate, Estimated, Actual, Weight)
        listTasks.add(new TaskDTO("T01", "E-Commerce", "Backend API", "Rian", "DONE", LocalDate.of(2026, 5, 15), 8, 10, 40)); [cite: 31, 45]
        listTasks.add(new TaskDTO("T02", "E-Commerce", "Frontend UI", "Rian", "IN PROGRESS", LocalDate.of(2026, 5, 19), 12, 6, 30)); [cite: 32]
        listTasks.add(new TaskDTO("T03", "E-Commerce", "Testing", "Siti", "OPEN", LocalDate.of(2026, 5, 10), 4, 0, 30)); [cite: 33]

        System.out.println("=== REKAPITULASI PROYEK & TASK ===");

        // 1. Hitung Total Progress Project (E-Commerce)
        double projectProgress = service.calculateProjectProgress(listTasks);
        System.out.printf("Total Progress Project: %.2f%%\n", projectProgress); [cite: 35]

        System.out.println("\n--- Performa Per Task ---");
        for (TaskDTO task : listTasks) {
            double variance = service.calculateVariance(task);
            double productivity = service.calculateProductivity(task);
            String sla = service.checkSlaStatus(task);

            System.out.println("Task: " + task.getTitle() + " [" + task.getStatus() + "]");
            System.out.printf("   Variance Jam: %+.1f jam\n", variance); [cite: 46]
            System.out.printf("   Produktivitas: %.1f%%\n", productivity);
            System.out.println("   Status SLA: " + sla);
        }

        // 2. Hitung Workload per Assignee (Contoh: Rian)
        System.out.println("\n--- Beban Kerja (Workload) ---");
        double workloadRian = service.calculateAssigneeWorkload(listTasks, "Rian");
        System.out.println("Total Workload Aktif Rian: " + workloadRian + " jam"); [cite: 39]
    }
}