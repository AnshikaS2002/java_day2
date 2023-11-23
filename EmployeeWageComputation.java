import java.util.Random;
import java.util.Scanner;

public class EmployeeWageComputation {

    private static final int FULL_DAY_HOURS = 8;
    private static final int PART_TIME_HOURS = 4;

    private static int checkAttendance() {
        Random random = new Random();
        return random.nextInt(3);
    }

    private static int calculateDailyWageWithSwitch(int attendance, int hourlyWage) {
        switch (attendance) {
            case 2:
                return hourlyWage * FULL_DAY_HOURS;
            case 1:
                return hourlyWage * PART_TIME_HOURS;
            default:
                return 0;
        }
    }

    private static int calculateDailyWageWithoutSwitch(int attendance, int hourlyWage) {
        if (attendance == 2) {
            return hourlyWage * FULL_DAY_HOURS;
        } else if (attendance == 1) {
            return hourlyWage * PART_TIME_HOURS;
        } else {
            return 0;
        }
    }

    public static int calculateMonthlyWage(int hourlyWage, int workingDays, int workingHours) {
        int totalWage = 0;
        int totalHours = 0;

        for (int day = 0; day < workingDays; day++) {
            int attendance = checkAttendance();
            int dailyWage = calculateDailyWageWithoutSwitch(attendance, hourlyWage);
            totalWage += dailyWage;
            totalHours += dailyWage / hourlyWage;

            if (totalHours >= workingHours) {
                break;
            }
        }

        return totalWage;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        int hourlyWage = 20;
        int workingDays = 20;
        int workingHours = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the hourly wage of the employee: ");
        hourlyWage = scanner.nextInt();

        System.out.println("Enter total working days of employee");
        workingDays = scanner.nextInt();

        System.out.println("Enter the total working hours of employee");
        workingHours = scanner.nextInt();

        int monthlyWage = calculateMonthlyWage(hourlyWage, workingDays, workingHours);

        System.out.println("Monthly Wage: " + monthlyWage);
        scanner.close();
    }
}
