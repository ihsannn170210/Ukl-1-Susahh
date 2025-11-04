import java.util.Scanner;

public class rataratanilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();

        double[][] nilai = new double[jumlahSiswa][3];
        String[] namaSiswa = new String[jumlahSiswa];

        // Input data siswa
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nama siswa ke-" + (i + 1) + ": ");
            namaSiswa[i] = input.next();
            System.out.print("Masukkan nilai UTS " + namaSiswa[i] + ": ");
            nilai[i][0] = input.nextDouble();
            System.out.print("Masukkan nilai UAS " + namaSiswa[i] + ": ");
            nilai[i][1] = input.nextDouble();
            nilai[i][2] = (nilai[i][0] + nilai[i][1]) / 2; // Hitung rata-rata
        }

        // Tampilkan hasil
        System.out.println("\n=== HASIL RATA-RATA NILAI ===");
        System.out.printf("%-15s %-10s %-10s %-10s\n", "Nama", "UTS", "UAS", "Rata-rata");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.printf("%-15s %-10.2f %-10.2f %-10.2f\n", namaSiswa[i], nilai[i][0], nilai[i][1], nilai[i][2]);
        }

        input.close();
    }
}
