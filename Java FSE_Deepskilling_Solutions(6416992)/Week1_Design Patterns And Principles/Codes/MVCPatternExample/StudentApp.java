package MVCPatternExample;

public class StudentApp {
    public static void main(String[] args) {
        Student model = new Student();
        model.setName("Yerlam Deepika");
        model.setId("6416992");
        model.setGrade("A");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        System.out.println("--- Updating Student Info ---");
        controller.setStudentName("Yerlam Sai Deepika");
        controller.setStudentGrade("A+");
        controller.updateView();
    }
}
