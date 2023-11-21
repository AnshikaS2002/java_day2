import java.util.Random;

public class EmployeeWageComputation {

    boolean checkAttendance() {
        Random random = new Random();
        int present = random.nextInt(2);
        return (present == 1);
    }

    int dailyWage() {
        EmployeeWageComputation ewc = new EmployeeWageComputation();
        if (ewc.checkAttendance()) {
            return (20 * 8);
        } else {
            return 0;
        }
    }

    int partTimeWage() {
        EmployeeWageComputation ewc = new EmployeeWageComputation();
        if (ewc.checkAttendance()) {
            return (20 * 4);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
    }
}