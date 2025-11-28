
import java.util.*;

public class PensionContributionCalculatorWithSentinel {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int SENTINEL = -1;
        int salary, age;
        double Employee_Contribution=0, Employer_Contribution=0, Total_Contribution=0;

        System.out.println("Enter the salary :");
        salary = sc.nextInt();

        while (salary != SENTINEL) {
            System.out.println("Enter your age :");
            age = sc.nextInt();
            if (age < 55) {
                Employee_Contribution = salary * 0.2;
                Employer_Contribution = salary * 0.17;
            } else if (age >= 55 && age < 60) {
                Employee_Contribution = salary * 0.13;
                Employer_Contribution = salary * 0.13;
            } else if (age >= 60 && age < 65) {
                Employee_Contribution = salary * 0.09;
                Employer_Contribution = salary * 0.09;
            } else if (age >= 65) {
                Employee_Contribution = salary * 0.075;
                Employer_Contribution = salary * 0.075;
            }
            Total_Contribution = Employee_Contribution + Employer_Contribution ;
            System.out.printf("The Emplyees Contribution is :%.2f%n", Employee_Contribution);
            System.out.printf("The Employeers Contribution is :%.2f%n", Employer_Contribution);
            System.out.printf("The total contribution is :%.2f%n", Total_Contribution);

            System.out.print("Enter the monthly salary (or -1 to end): ");
            salary = sc.nextInt();
        }
        System.out.println("Thank you !!");
    }
}
