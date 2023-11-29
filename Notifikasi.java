package sistemperpustakaan;

import java.util.Date;

public class Notifikasi {
    public void kirimNotifikasiPeminjaman(AnggotaPerpustakaan anggota, Buku buku, Date tanggalPeminjaman) {
        System.out.println("Notifikasi: Peminjaman " + buku.getJudul() + " oleh " + anggota.getNama() +
                " pada tanggal " + tanggalPeminjaman);
        System.out.println("");
    }

    public void kirimNotifikasiPengembalian(AnggotaPerpustakaan anggota, Buku buku, Date tanggalPengembalian) {
        System.out.println("Notifikasi: Pengembalian " + buku.getJudul() + " oleh " + anggota.getNama() +
                " pada tanggal " + tanggalPengembalian);
        System.out.println("");
    }
}