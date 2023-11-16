package Week11;

import java.util.Scanner;

public class SegitigaAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        
        // mencetak tampilan segitiga angka
        for (int i = 1; i <= N; i++) {
            // mencetak spasi sebelum angka
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            // mencetak angka
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
