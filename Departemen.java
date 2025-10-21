import java.util.ArrayList;

public class Departemen {
    private String namaDepartemen;
    private ArrayList<Karyawan> daftarKaryawan = new ArrayList<>();

    public Departemen(String namaDepartemen) {
        this.namaDepartemen = namaDepartemen;
    }

    public void tambahKaryawan(Karyawan k) {
        daftarKaryawan.add(k);
    }

    public void hapusKaryawan(String id) {
        daftarKaryawan.removeIf(k -> k.getId().equals(id));
    }

    public void tampilkanSemua() {
        System.out.println("=== Daftar Karyawan Departemen " + namaDepartemen + " ===");
        for (Karyawan k : daftarKaryawan) {
            k.tampilkanInfo();
        }
    }

    public double hitungTotalGaji() {
        double total = 0;
        for (Karyawan k : daftarKaryawan) {
            total += k.getGaji();
        }
        return total;
    }
}
