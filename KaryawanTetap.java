public class KaryawanTetap extends Karyawan {
    private double tunjangan;

    public KaryawanTetap(String id, String nama, String jabatan, double gaji, double tunjangan) {
        super(id, nama, jabatan, gaji);
        this.tunjangan = tunjangan;
    }

    public double hitungGaji() {
        return gaji + tunjangan;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println(id + "\t" + nama + "\t" + jabatan + "\tTetap\t" + hitungGaji());
    }
}
