import java.util.Scanner;

public class Salary24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numAttendance, numAbsence, totalSalary, salary, salaryDeduction;

        System.out.println("Input attendance number: ");
        numAttendance = input.nextInt();
        System.out.println("Input absence number: ");
        numAbsence = input.nextInt();
        System.out.println("Input salary: ");
        salary = input.nextInt();
        System.out.println("Input salary deduction: ");
        salaryDeduction = input.nextInt();

        totalSalary = (numAttendance*salary)-(numAbsence*salaryDeduction);
        System.out.println("Total salary: " + totalSalary);
    }
}
