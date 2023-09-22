import java.util.HashMap;
import java.util.Scanner;

public class kasir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, Integer> daftarBarang = new HashMap<>();
        daftarBarang.put("Baju", 50000);
        daftarBarang.put("Celana", 70000);
        daftarBarang.put("Sepatu", 150000);

        System.out.println("Daftar barang yang tersedia:");
        for (String barang : daftarBarang.keySet()) {
            System.out.println(barang + " - " + daftarBarang.get(barang));
        }

        int totalHarga = 0;
        boolean isSelesai = false;

        while (!isSelesai) {
            System.out.print("Masukkan barang yang dibeli (atau selesai untuk mengakhiri pembelian): ");
            String barang = scanner.nextLine();

            if (barang.equalsIgnoreCase("selesai")) {
                isSelesai = true;
            } else if (daftarBarang.containsKey(barang)) {
                System.out.print("Masukkan jumlah " + barang + " yang dibeli: ");
                int jumlahBarang = scanner.nextInt();
                totalHarga += daftarBarang.get(barang) * jumlahBarang;
                System.out.println("Harga " + barang + " (" + jumlahBarang + " barang): " + daftarBarang.get(barang) * jumlahBarang);
            } else {
                System.out.println("Barang tidak ditemukan");
            }

            scanner.nextLine(); // membersihkan buffer
        }

        System.out.println("Total harga: " + totalHarga);
    }
}