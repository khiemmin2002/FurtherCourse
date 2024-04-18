package W4.Problem2;

import java.util.List;

public class RegularStudent extends Student {
    double courseUnitFee;

    public RegularStudent(String studentID, String fullName, String major, List<String> courses, double courseUnitFee) {
        super(studentID, fullName, major, courses);
        this.courseUnitFee = courseUnitFee;
    }


    @Override
    public double calcFee() {
        return getCourses().size() * courseUnitFee;
    }
}
