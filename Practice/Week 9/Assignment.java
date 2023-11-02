import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int jmlElemen = sc.nextInt();

        int[] elemen = new int[jmlElemen];
        int temp = 0;

        for (int i = 0; i < jmlElemen; i++) {
            System.out.print("Masukkan elemen ke-"+(i+1)+" : ");
            elemen[i] = sc.nextInt();
        }

        for (int i = 0; i < elemen.length; i++) {
            for (int j = 1; j < elemen.length; j++) {
                if (elemen[j-1] < elemen[j]) {
                    //swap element
                    temp = elemen[j];
                    elemen[j] = elemen[j-1];
                    elemen[j-1] = temp;
                }
            }
        }

        int nilaiTertinggi = elemen[0];
        int nilaiTerendah = elemen[elemen.length - 1];
        int total = 0;

        for (int i = 0; i < elemen.length; i ++) {
            total += elemen[i];
        }

        double rata2 = (double) total/jmlElemen;

        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println("Rata-rata: " + rata2);
        
    }
}
