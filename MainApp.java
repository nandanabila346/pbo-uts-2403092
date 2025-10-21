import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Departemen dep = new Departemen("Teknologi Informasi");

        int pilih;
        do {
            System.out.println("\n===== APLIKASI MANAJEMEN DATA KARYAWAN =====");
            System.out.println("1. Tambah Karyawan");
            System.out.println("2. Hapus Karyawan");
            System.out.println("3. Lihat Data Karyawan");
            System.out.println("4. Hitung Total Gaji");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("ID: ");
                    String id = sc.next();
                    System.out.print("Nama: ");
                    String nama = sc.next();
                    System.out.print("Jabatan: ");
                    String jabatan = sc.next();
                    System.out.print("Status (Tetap/Kontrak): ");
                    String status = sc.next();
                    System.out.print("Gaji: ");
                    double gaji = sc.nextDouble();

                    if (status.equalsIgnoreCase("Tetap")) {
                        System.out.print("Tunjangan: ");
                        double tunjangan = sc.nextDouble();
                        dep.tambahKaryawan(new KaryawanTetap(id, nama, jabatan, gaji, tunjangan));
                    } else {
                        System.out.print("Lama Kontrak (bulan): ");
                        int lama = sc.nextInt();
                        dep.tambahKaryawan(new KaryawanKontrak(id, nama, jabatan, gaji, lama));
                    }
                    break;

                case 2:
                    System.out.print("Masukkan ID Karyawan yang dihapus: ");
                    String hapus = sc.next();
                    dep.hapusKaryawan(hapus);
                    System.out.println("Data karyawan berhasil dihapus.");
                    break;

                case 3:
                    dep.tampilkanSemua();
                    break;

                case 4:
                    System.out.println("Total gaji semua karyawan: " + dep.hitungTotalGaji());
                    break;
            }
        } while (pilih != 5);

        sc.close();
    }
}
