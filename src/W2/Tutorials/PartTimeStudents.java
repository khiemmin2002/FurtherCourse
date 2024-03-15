package W2.Tutorials;

public class PartTimeStudents extends Students {
    private double minHours;
    private double maxHours;

    private static int countPartTimeStudents = 0;

    public PartTimeStudents() {
        super();
        this.minHours = 0;
        this.maxHours = 0;
        countPartTimeStudents++;
    }

    public PartTimeStudents(String studentId, String fullName, String major) {
        super(studentId, fullName, major);
        this.minHours = 0;
        this.maxHours = 0;
        countPartTimeStudents++;
    }

    public PartTimeStudents(String studentId, String fullName, String major, double minHours, double maxHours) {
        super(studentId, fullName, major);
        this.minHours = minHours;
        this.maxHours = maxHours;
        countPartTimeStudents++;
    }

    public void registerHours(int minHours, int maxHours) {
        this.minHours = minHours;
        this.maxHours = maxHours;
    }

    public double getMinHours() {
        return minHours;
    }

    public double getMaxHours() {
        return maxHours;
    }

    public static int getCountPartTimeStudents() {
        return countPartTimeStudents;
    }

    @Override
    public String toString() {
        return "PartTimeStudents{" +
                "studentId='" + getStudentId()  +
                ", fullName='" + getFullName()  +
                ", major='" + getMajor() +
                "minHours=" + minHours +
                ", maxHours=" + maxHours +
                '}';
    }
}
