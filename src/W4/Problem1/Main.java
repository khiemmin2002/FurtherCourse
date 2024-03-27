package W4.Problem1;

public class Main {
    public static void main(String[] args) {
        Student model = new Student();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.inputStudentInfo();
        controller.inputStudentInfo();

        controller.updateView();

    }
}
