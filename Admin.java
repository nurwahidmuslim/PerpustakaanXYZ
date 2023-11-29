package sistemperpustakaan;

class Admin {
    public void kelolaAnggota(AnggotaPerpustakaan anggota) {
        System.out.println("Manajemen Anggota: ");
        System.out.println("Nama: " + anggota.getNama());
        System.out.println("Nomor Anggota: " + anggota.getNomorAnggota());
        System.out.println("Alamat: " + anggota.getAlamat());
        System.out.println("Sejarah Peminjaman:");

        for (TransaksiPeminjaman transaksi : anggota.getSejarahPeminjaman()) {
            System.out.println("  - Buku: " + transaksi.getBuku().getJudul());
            System.out.println("    Tanggal Peminjaman: " + transaksi.getTanggalPeminjaman());
            System.out.println("    Durasi Peminjaman: " + transaksi.getDurasiPeminjaman() + " hari");
        }
        
        System.out.println("");
    }

    public void kelolaBuku(Buku buku) {
        System.out.println("Manajemen Buku: ");
        System.out.println("Judul: " + buku.getJudul());
        System.out.println("Pengarang: " + buku.getPengarang());
        System.out.println("Nomor ISBN: " + buku.getNomorISBN());
        System.out.println("Ketersediaan: " + (buku.isKetersediaan() ? "Tersedia" : "Tidak Tersedia"));
        System.out.println("");
    }

    public void hasilkanLaporanAktivitas() {
        System.out.println("Laporan aktivitas berhasil dihasilkan.");
    }
}