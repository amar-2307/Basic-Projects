import java.util.Scanner;

public class ToDoListApp {
    public static void main(String[] args) 
    {
        try (Scanner scanner = new Scanner(System.in)) {
            ToDoListManager manager = new ToDoListManager();

            while (true) {
                System.out.println("\n--- To-Do List Application ---");
                System.out.println("1. Add Task");
                System.out.println("2. View Tasks");
                System.out.println("3. Mark Task as Completed");
                System.out.println("4. Delete Task");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter task description: ");
                        String description = scanner.nextLine();
                        manager.addTask(description);
                        break;
                    case 2:
                        manager.displayTasks();
                        break;
                    case 3:
                        System.out.print("Enter task number to mark as completed: ");
                        int completeIndex = scanner.nextInt() - 1;
                        manager.markTaskCompleted(completeIndex);
                        break;
                    case 4:
                        System.out.print("Enter task number to delete: ");
                        int deleteIndex = scanner.nextInt() - 1;
                        manager.deleteTask(deleteIndex);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}
