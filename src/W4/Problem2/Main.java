package W4.Problem2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main (String args[]) {
        Student regularStudent = new RegularStudent("s01", "Alice", "IT", new ArrayList<String>(Arrays.asList("C1", "C2", "C3")), 1000);
        System.out.println("Regular student with 3 course: " + regularStudent.calcFee());

        Student lateStudent = new LateStudent(regularStudent);
        System.out.println("Late: " + lateStudent.calcFee());

        Student outStanding = new OutStandingStudent(regularStudent);
        System.out.println("Outstanding not late: " + outStanding.calcFee());

        Student outStandingLate = new OutStandingStudent(lateStudent);
        System.out.println("Outstanding but late: " + outStandingLate.calcFee());
    }
}
