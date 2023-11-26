import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class EmployeeWageComputation {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> companyWage = new HashMap<String, Integer>();
        System.out.println("Enter the total number of companies");
        int numOfCompanies = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numOfCompanies; i++) {
            System.out.print("Enter company name : ");
            String companyName = scanner.nextLine();

            System.out.print("Enter hourly wage : ");
            int hourlyWage = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter max working days : ");
            int workingDays = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter max working hours : ");
            int workingHours = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter total number of employees");
            int totalEmployees = scanner.nextInt();
            scanner.nextLine();

            EmpWageBuilder empWageBuilder = new EmpWageBuilder(20, 25, 100);
            int totalWage = 0;
            for (int j = 0; j < totalEmployees; j++) {
                totalWage += empWageBuilder.calculateMonthlyWage();
            }
            companyWage.put(companyName, totalWage);
        }
        // for (Map.Entry<String, String> set : foodTable.entrySet())
        for (Map.Entry<String, Integer> set : companyWage.entrySet()) {
            System.out.println("Company name : " + set.getKey() + " Total wage : " + set.getValue());
        }

        scanner.close();
    }
}
