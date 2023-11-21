import java.util.Random;

public class EmployeeWageComputation {

    int checkAttendance() {
        Random random = new Random();
        int present = random.nextInt(2);
        return (present == 1) ? 1 : 0;
    }

    int dailyWage() {
        EmployeeWageComputation ewc = new EmployeeWageComputation();
        if (ewc.checkAttendance() == 1) {
            return (20 * 8);
        } else {
            return 0;
        }
    }

    int partTimeWage() {
        EmployeeWageComputation ewc = new EmployeeWageComputation();
        if (ewc.checkAttendance() == 1) {
            return (20 * 4);
        } else {
            return 0;
        }
    }

    int dailyWageWithSwitch() {
        EmployeeWageComputation ewc = new EmployeeWageComputation();
        int present = ewc.checkAttendance();
        int wage = 0;
        switch (present) {
            case 1:
                wage = 20 * 8;
                break;

            default:
                wage = 0;
                break;
        }
        return wage;
    }

    int partTimeWageWithSwitch() {
        EmployeeWageComputation ewc = new EmployeeWageComputation();
        int present = ewc.checkAttendance();
        int wage = 0;
        switch (present) {
            case 1:
                wage = 20 * 4;
                break;

            default:
                wage = 0;
                break;
        }
        return wage;
    }

    int monthlyWage() {
        EmployeeWageComputation ewc = new EmployeeWageComputation();
        int dailyWage = ewc.dailyWage();
        return dailyWage * 20;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
    }
}