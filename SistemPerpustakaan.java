package sistemperpustakaan;

import java.util.Date;

public class SistemPerpustakaan {
    public static void main(String[] args) {
        AnggotaPerpustakaan anggota1 = new AnggotaPerpustakaan("Nurwahid Muslim", 1163, "Jl. Contoh No. 1");
        AnggotaPerpustakaan anggota2 = new AnggotaPerpustakaan("Rio Sulendra", 1026, "Jl. Contoh No. 2");
        AnggotaPerpustakaan anggota3 = new AnggotaPerpustakaan("Yusuf Arifin", 1158, "Jl. Contoh No. 3");
        Buku buku1 = new Buku("Java Programming", "Pengarang1", "978-0-1234-5678-9");
        Buku buku2 = new Buku("Python Programming", "Pengarang2", "123-0-9876-5432-1");
        TransaksiPeminjaman transaksiPeminjaman = new TransaksiPeminjaman(anggota1, buku1, new Date(), 14);
        TransaksiPengembalian transaksiPengembalian = new TransaksiPengembalian(anggota2, buku2, new Date());
        Notifikasi notifikasi = new Notifikasi();
        Admin admin = new Admin();

        anggota1.tambahTransaksiPeminjaman(transaksiPeminjaman);

        notifikasi.kirimNotifikasiPeminjaman(anggota1, buku1, transaksiPeminjaman.getTanggalPeminjaman());
        notifikasi.kirimNotifikasiPengembalian(anggota2, buku2, transaksiPengembalian.getTanggalPengembalian());

        admin.kelolaAnggota(anggota1);
        admin.kelolaAnggota(anggota2);
        admin.kelolaAnggota(anggota3);
        admin.kelolaBuku(buku1);
        admin.kelolaBuku(buku2);

        admin.hasilkanLaporanAktivitas();
    }
}