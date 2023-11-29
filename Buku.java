package sistemperpustakaan;

class Buku {
    private String judul;
    private String pengarang;
    private String nomorISBN;
    private boolean ketersediaan;

    public Buku(String judul, String pengarang, String nomorISBN) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.nomorISBN = nomorISBN;
        this.ketersediaan = true;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getNomorISBN() {
        return nomorISBN;
    }

    public boolean isKetersediaan() {
        return ketersediaan;
    }

    public void setKetersediaan(boolean ketersediaan) {
        this.ketersediaan = ketersediaan;
    }
}