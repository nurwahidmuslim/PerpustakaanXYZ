package sistemperpustakaan;

import java.util.Date;

class TransaksiPengembalian {
    private AnggotaPerpustakaan anggota;
    private Buku buku;
    private Date tanggalPengembalian;

    public TransaksiPengembalian(AnggotaPerpustakaan anggota, Buku buku, Date tanggalPengembalian) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPengembalian = tanggalPengembalian;
    }

    public AnggotaPerpustakaan getAnggota() {
        return anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public Date getTanggalPengembalian() {
        return tanggalPengembalian;
    }
}