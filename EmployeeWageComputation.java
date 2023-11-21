import java.util.Random;

public class EmployeeWageComputation {

    boolean checkAttendance() {
        Random random = new Random();
        int present = random.nextInt(2);
        return (present == 1);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
    }
}