package W4.Problem1;

public class Main {
    public static void main(String args[]) {
        StudentController controller = new StudentController(new Student(), new StudentViewText());
        controller.eventLoop();
    }
}
