import java.util.Scanner;

public class KasirSederhana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalHarga = 0;
        boolean isSelesai = false;

        System.out.println("===== PROGRAM KASIR SEDERHANA =====");

        while (!isSelesai) {
            System.out.println("Masukkan harga barang (atau 0 untuk selesai) : ");
            int hargaBarang = sc.nextInt();

            if (hargaBarang == 0) {
                isSelesai = true;
            } else {
                totalHarga += hargaBarang;
            }
        }
        System.out.println("Total harga yang harus dibayar: " + totalHarga);
    }    
}
