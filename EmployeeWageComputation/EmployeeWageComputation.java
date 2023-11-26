import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class EmployeeWageComputation {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total number of companies");
        int numOfCompanies = scanner.nextInt();
        scanner.nextLine();
        EmpWageBuilder empWageBuilder = new EmpWageBuilder(numOfCompanies);
        empWageBuilder.addCompanyWage();
        empWageBuilder.getCompanyWage();
        scanner.close();
    }
}
