package Week14;

import java.util.Scanner;

public class PowerRecursive24 {
    static int calculatePower(int base, int pow) {
        if(pow==0) {
            return 1;
        } else {
            System.out.print(base + "x");
            return base*calculatePower(base, pow-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Base Number: ");
        int base = sc.nextInt();
        System.out.print("Input Power Number: ");
        int power = sc.nextInt();

        System.out.print("Result of "+base+" power "+power+" = ");
        int result = calculatePower(base, power);
        System.out.println("1 = " + result);
    }
}
