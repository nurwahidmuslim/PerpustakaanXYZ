package sistemperpustakaan;

import java.util.ArrayList;
import java.util.List;

class AnggotaPerpustakaan {
    private String nama;
    private int nomorAnggota;
    private String alamat;
    private List<TransaksiPeminjaman> sejarahPeminjaman;

    public AnggotaPerpustakaan(String nama, int nomorAnggota, String alamat) {
        this.nama = nama;
        this.nomorAnggota = nomorAnggota;
        this.alamat = alamat;
        this.sejarahPeminjaman = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public int getNomorAnggota() {
        return nomorAnggota;
    }

    public String getAlamat() {
        return alamat;
    }

    public List<TransaksiPeminjaman> getSejarahPeminjaman() {
        return sejarahPeminjaman;
    }

    public void tambahTransaksiPeminjaman(TransaksiPeminjaman transaksi) {
        sejarahPeminjaman.add(transaksi);
    }
}