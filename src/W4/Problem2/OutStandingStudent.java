package W4.Problem2;

public class OutStandingStudent extends Student {
    private Student student;

    private static final double OUTSTANDING_DEDUCTION = 1000;

    public OutStandingStudent(Student student) {
        super(student.getStudentID(), student.getFullName(), student.getMajor(), student.getCourses());
        this.student = student;
    }
    @Override
    public double calcFee() {
        // base behavior
        double totalCourseAmount = student.calcFee();

        // decorated behavior
        return totalCourseAmount > OUTSTANDING_DEDUCTION ? (totalCourseAmount - 1000) : 0;
    }
}
