 import java.util.Scanner;

public class Resistor {
    public static void main(String[] args) {
        int R1, R2, R3, R4, I;
        double V;

        Scanner sc = new Scanner(System.in);
        System.out.print("Input R1: ");
        R1 = sc.nextInt();
        System.out.print("Input R2: ");
        R2 = sc.nextInt();
        System.out.print("Input R3: ");
        R3 = sc.nextInt();
        System.out.print("Input R4: ");
        R4 = sc.nextInt();
        System.out.print("Input I : ");
        I  = sc.nextInt();

        double Rtotal;
        Rtotal = R4 + (1/(1.0/R1+1.0/R2+1.0/R3));
        V = I*Rtotal;

        System.out.println("V = " + V);
    }
}
