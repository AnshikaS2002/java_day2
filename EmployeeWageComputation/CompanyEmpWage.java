import java.util.Random;

interface CalculateWage {

    int calculateMonthlyWage();

    int getTotalWage();
}

public class CompanyEmpWage implements CalculateWage {
    private static final int FULL_DAY_HOURS = 8;
    private static final int PART_TIME_HOURS = 4;

    int hourlyWage;
    int workingDays;
    int workingHours;
    int empCnt;

    CompanyEmpWage(int hourlyWage, int workingDays, int workingHours, int empCnt) {
        this.hourlyWage = hourlyWage;
        this.workingDays = workingDays;
        this.workingHours = workingHours;
        this.empCnt = empCnt;
    }

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

    public int calculateMonthlyWage() {
        int totalMonthlyWage = 0;
        int totalHours = 0;

        for (int day = 0; day < workingDays; day++) {
            int attendance = checkAttendance();
            int dailyWage = calculateDailyWageWithoutSwitch(attendance, hourlyWage);
            totalMonthlyWage += dailyWage;
            totalHours += dailyWage / hourlyWage;

            if (totalHours >= workingHours) {
                break;
            }
        }

        return totalMonthlyWage;
    }

    public int getTotalWage() {
        int totalWage = 0;
        for (int j = 0; j < empCnt; j++) {
            totalWage += calculateMonthlyWage();
        }
        return totalWage;
    }
}
