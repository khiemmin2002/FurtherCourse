package W4.Problem2;

public class LateStudent extends Student{
    private Student student;
    private static final double LATE_PAYMENT_RATE = 0.1;

    public LateStudent(Student student) {
        super(student.getStudentID(), student.getFullName(), student.getMajor(), student.getCourses());
        this.student = student;
    }

    @Override
    public double calcFee() {
        // base behavior
        double totalCourseAmount = student.calcFee();

        // decorated behavior
        return totalCourseAmount * (1 + LATE_PAYMENT_RATE);
    }
}
