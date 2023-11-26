package Week13;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        if (decimalNumber == 0) {
            System.out.println("Binary representation: 0");
        } else {
            String binaryNumber = ""; // Initialize an empty string for binary representation

            while (decimalNumber > 0) {
                int remainder = decimalNumber % 2;
                binaryNumber = remainder + binaryNumber; // Append the remainder to the left
                decimalNumber /= 2;
            }

            System.out.println("Binary representation: " + binaryNumber);
        }

        scanner.close();
    }
}


// add function
/*import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        String binaryNumber = decimalToBinary(decimalNumber);

        System.out.println("Binary representation: " + binaryNumber);

        scanner.close();
    }

    // Function to convert decimal to binary
    private static String decimalToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0";
        }

        String binary = "";
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary = remainder + binary; // Append the remainder to the left
            decimalNumber /= 2;
        }

        return binary;
    }
}*/
