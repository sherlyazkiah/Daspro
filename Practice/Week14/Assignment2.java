package Week14;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input N: ");
        int n = sc.nextInt();

        System.out.print("Result = ");
        String expression = createSummationExpression(n);
        System.out.print(expression + "+");
        int result = sumRecursive(n);
        System.out.println(" = " + result);
    }

    static String createSummationExpression(int n) {
        StringBuilder expression = new StringBuilder("1");
        for (int i = 2; i <= n; i++) {
            expression.append("+").append(i);
        }
        return expression.toString();
    }

    static int sumRecursive(int n) {
        if(n==1) {
            return 1;
        } else {
            return n + sumRecursive(n-1);
        }
    }
}
