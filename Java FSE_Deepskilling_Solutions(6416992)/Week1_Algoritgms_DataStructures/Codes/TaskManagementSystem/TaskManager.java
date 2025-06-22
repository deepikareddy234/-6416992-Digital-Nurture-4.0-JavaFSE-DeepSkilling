package TaskManagementSystem;

public class TaskManager {
    private TaskNode head;

    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Task added: " + task);
    }

    public void showAllTasks() {
        TaskNode current = head;
        System.out.println("\n--- Task List ---");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public Task searchTaskById(String taskId) {
        TaskNode current = head;
        while (current != null) {
            if (current.data.taskId.equalsIgnoreCase(taskId)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public boolean deleteTaskById(String taskId) {
        if (head == null) return false;

        if (head.data.taskId.equalsIgnoreCase(taskId)) {
            head = head.next;
            return true;
        }

        TaskNode prev = head;
        TaskNode curr = head.next;

        while (curr != null) {
            if (curr.data.taskId.equalsIgnoreCase(taskId)) {
                prev.next = curr.next;
                return true;
            }
            prev = curr;
            curr = curr.next;
        }
        return false;
    }
}
