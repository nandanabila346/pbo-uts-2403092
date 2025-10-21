public class Karyawan {
    protected String id;
    protected String nama;
    protected String jabatan;
    protected double gaji;

    public Karyawan(String id, String nama, String jabatan, double gaji) {
        this.id = id;
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    public void tampilkanInfo() {
        System.out.println(id + "\t" + nama + "\t" + jabatan + "\t" + gaji);
    }

    public double getGaji() {
        return gaji;
    }

    public String getId() {
        return id;
    }
}
