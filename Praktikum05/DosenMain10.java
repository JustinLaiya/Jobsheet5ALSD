package Praktikum05;
import java.util.Scanner;

public class DosenMain10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah maksimal data dosen: ");
        int jumlahDosen = scanner.nextInt();
        DataDosen10 daftarDosen = new DataDosen10(jumlahDosen);

        boolean lanjut = true;
        while (lanjut) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah data dosen");
            System.out.println("2. Tampilkan data dosen");
            System.out.println("3. Sorting ASC (Usia termuda ke tertua)");
            System.out.println("4. Sorting DSC (Usia tertua ke termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    if (daftarDosen.idx < jumlahDosen) {
                        System.out.print("Masukkan kode dosen: ");
                        String kode = scanner.nextLine();

                        System.out.print("Masukkan nama dosen: ");
                        String nama = scanner.nextLine();

                        System.out.print("Jenis Kelamin (true = Laki-laki, false = Perempuan): ");
                        boolean jenisKelamin = scanner.nextBoolean();

                        System.out.print("Masukkan usia dosen: ");
                        int usia = scanner.nextInt();
                        scanner.nextLine(); 

                        daftarDosen.tambah(new Dosen10(kode, nama, jenisKelamin, usia));
                    } else {
                        System.out.println("Data dosen sudah penuh!");
                    }
                    break;

                case 2:
                    System.out.println("\nData Dosen:");
                    daftarDosen.tampil();
                    break;

                case 3:
                    daftarDosen.sortingASC();
                    System.out.println("\nData dosen setelah sorting ASC (Usia termuda ke tertua):");
                    daftarDosen.tampil();
                    break;

                case 4:
                    daftarDosen.sortingDSC();
                    System.out.println("\nData dosen setelah sorting DSC (Usia tertua ke termuda):");
                    daftarDosen.tampil();
                    break;

                case 5:
                    lanjut = false;
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
        scanner.close();
    }
}