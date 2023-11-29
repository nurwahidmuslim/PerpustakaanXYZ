package sistemperpustakaan;

import java.util.Date;

class TransaksiPeminjaman {
    private AnggotaPerpustakaan anggota;
    private Buku buku;
    private Date tanggalPeminjaman;
    private int durasiPeminjaman;

    public TransaksiPeminjaman(AnggotaPerpustakaan anggota, Buku buku, Date tanggalPeminjaman, int durasiPeminjaman) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.durasiPeminjaman = durasiPeminjaman;
    }

    public AnggotaPerpustakaan getAnggota() {
        return anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public Date getTanggalPeminjaman() {
        return tanggalPeminjaman;
    }

    public int getDurasiPeminjaman() {
        return durasiPeminjaman;
    }
}