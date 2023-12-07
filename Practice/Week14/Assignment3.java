package Week14;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check for primality: ");
        int number = sc.nextInt();

        if (isPrime(number, number - 1)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }

    static boolean isPrime(int n, int divisor) {
        if (n <= 1) {
            return false;
        }
        if (divisor == 1) {
            return true;
        }

        if (n % divisor == 0) {
            return false;
        } else {
            return isPrime(n, divisor - 1);
        }
    }
}
