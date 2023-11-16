package Week11;

import java.util.Scanner;

public class PersegiAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input nilai N (minimal 3)
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = sc.nextInt();

        // Validasi nilai N
        if (N < 3) {
            System.out.println("Nilai N harus minimal 3.");
            return;
        }

        // Mencetak pola angka
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                // Jika berada di baris pertama/terakhir atau kolom pertama/terakhir,
                // cetak angka N, selain itu cetak spasi
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
