package TaskManagementSystem;

public class TaskSystemApp {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task("T001", "Design Homepage", "Pending"));
        manager.addTask(new Task("T002", "Implement Login", "In Progress"));
        manager.addTask(new Task("T003", "Setup Database", "Completed"));

        manager.showAllTasks();

        // Search task
        Task found = manager.searchTaskById("T002");
        System.out.println("\nSearch Result: " + (found != null ? found : "Task not found"));

        // Delete task
        boolean removed = manager.deleteTaskById("T001");
        System.out.println("\nDelete Result: " + (removed ? "Task deleted" : "Task not found"));

        manager.showAllTasks();
    }
}

