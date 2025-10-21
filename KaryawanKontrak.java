public class KaryawanKontrak extends Karyawan {
    private int lamaKontrak;

    public KaryawanKontrak(String id, String nama, String jabatan, double gaji, int lamaKontrak) {
        super(id, nama, jabatan, gaji);
        this.lamaKontrak = lamaKontrak;
    }

    public double hitungGaji() {
        return gaji;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println(id + "\t" + nama + "\t" + jabatan + "\tKontrak\t" + hitungGaji());
    }
}
