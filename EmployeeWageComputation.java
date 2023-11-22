import java.util.Random;

public class EmployeeWageComputation {

    private static final int FULL_DAY_HOURS = 8;
    private static final int PART_TIME_HOURS = 4;
    private static final int HOURLY_WAGE = 20;
    private static final int WORKING_DAYS = 20;
    private static final int WORKING_HOURS = 100;

    private static int checkAttendance() {
        Random random = new Random();
        return random.nextInt(3);
    }

    private static int calculateDailyWageWithSwitch(int attendance) {
        switch (attendance) {
            case 2:
                return HOURLY_WAGE * FULL_DAY_HOURS;
            case 1:
                return HOURLY_WAGE * PART_TIME_HOURS;
            default:
                return 0;
        }
    }

    private static int calculateDailyWageWithoutSwitch(int attendance) {
        if (attendance == 2) {
            return HOURLY_WAGE * FULL_DAY_HOURS;
        } else if (attendance == 1) {
            return HOURLY_WAGE * PART_TIME_HOURS;
        } else {
            return 0;
        }
    }

    public static int calculateMonthlyWage() {
        int totalWage = 0;
        int totalHours = 0;

        for (int day = 0; day < WORKING_DAYS; day++) {
            int attendance = checkAttendance();
            int dailyWage = calculateDailyWageWithoutSwitch(attendance);
            totalWage += dailyWage;
            totalHours += dailyWage / HOURLY_WAGE;

            if (totalHours >= WORKING_HOURS) {
                break;
            }
        }

        return totalWage;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int monthlyWage = calculateMonthlyWage();

        System.out.println("Monthly Wage: " + monthlyWage);
    }
}
