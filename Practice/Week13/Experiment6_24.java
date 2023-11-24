package Week13;

import java.util.Scanner;

public class Experiment6_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, l, t, L, vol;
        System.out.print("Input length = ");
        p = sc.nextInt();
        System.out.print("Input width = ");
        l = sc.nextInt();
        System.out.print("Input height = ");
        t = sc.nextInt();

        L = p*l;
        System.out.println("Area of the rectangle = " + L);
        vol = p*l*t;
        System.out.println("Volume of the rectangle = " + vol);
    }
}
