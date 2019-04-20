package entity;

public class Kendaraan {

    private String nomor;
    private String nama;
    private String jenis_kendaraan;
    private String warna;

    public Kendaraan(String nomor, String nama, String jenis_kendaraan, String warna) {
        this.nomor = nomor;
        this.nama = nama;
        this.jenis_kendaraan = jenis_kendaraan;
        this.warna = warna;
    }

    public boolean equals(Object object) {
        Kendaraan kdn = (Kendaraan) object;
        return nomor.equals(kdn.getnomor());
    }

    public String getnomor() {
        return nomor;
    }

    public void setnomor(String nomor) {
        this.nomor = nomor;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis_kendaraan() {
        return jenis_kendaraan;
    }

    public void setJenis_kendaraan(String jenis_kendaraan) {
        this.jenis_kendaraan = jenis_kendaraan;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
}