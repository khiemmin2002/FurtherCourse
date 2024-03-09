package W1.Extra;

public class Ex4 {
    public static void main(String[] args) {
        System.out.printf("%-9s%-15s%-5s%11s%10s\n", "Miles", "Kilometers", "|", "Kilometers", "Miles");
        for (int miles = 1, kilometers = 20; miles <= 10; miles++, kilometers += 5) {
            double milesToKilometers = miles * 1.609;
            double kilometersToMiles = kilometers / 1.609;
            // Adjust the spacing so that the total characters add up correctly before and after the divider.
            System.out.printf("%3d%13.2f%9s%11d%14.2f\n", miles, milesToKilometers, "|", kilometers, kilometersToMiles);
        }
    }
}
