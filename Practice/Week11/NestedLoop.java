package Week11;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] temps = new double[5][7];

        for (int i = 0;i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1));
            for (int j = 0;j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = sc.nextDouble();
            }
            System.out.println();
        }

        // menampilkan data temperatur menggunakan foreach loop
        for (double[] cityTemps : temps) {
            for (double temp : cityTemps) {
                System.out.print(temp + " ");
            }
            System.out.println();
        }

        /*for (int i = 0;i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1) + ": ");
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print(temps[i][j] + " ");
            }
            System.out.println();
        }*/

        sc.close();
    } 
}