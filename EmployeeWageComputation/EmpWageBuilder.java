import java.util.Random;
import java.util.Scanner;

public class EmpWageBuilder {
    int numOfCompanies;

    EmpWageBuilder(int numOfCompanies) {
        this.numOfCompanies = numOfCompanies;
    }

    void addCompanyWage() {
        Scanner scanner = new Scanner(System.in);
        CompanyEmpWage empList[] = new CompanyEmpWage[numOfCompanies];

        for (int i = 0; i < numOfCompanies; i++) {
            System.out.println("Company " + (i + 1));
            System.out.print("Enter hourly wage : ");
            int hourlyWage = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter max working days : ");
            int workingDays = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter max working hours : ");
            int workingHours = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter total number of employees : ");
            int totalEmployees = scanner.nextInt();
            scanner.nextLine();

            CompanyEmpWage companyEmpWage = new CompanyEmpWage(hourlyWage, workingDays, workingHours, totalEmployees);
            empList[i] = companyEmpWage;
        }

        for (int i = 0; i < numOfCompanies; i++) {
            System.out.println("Total wage of company " + (i + 1) + " is " + empList[i].getTotalWage());
        }
    }
}