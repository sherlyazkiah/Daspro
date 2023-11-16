package Week11;

import java.util.Scanner;

public class SegitigaBintang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        
        // mencetak tampilan segitiga bintang
        for (int i = N; i >= 1; i--) {
            // mencetak bintang
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
