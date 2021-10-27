package Soal2;

class Showroom {
    private String merk;
    private String tahunKeluaran;
    private double harga;
    private int stok;

    public Showroom(String merk, String tahunKeluaran, float harga, int stok){
        this.merk = merk;
        this.tahunKeluaran = tahunKeluaran;
        this.harga = harga;
        this.stok = stok;
    }
    String getMerk() {
        return merk;
    }
    String getTahunKeluaran() {
        return tahunKeluaran;
    }
    double getHarga() {
        return harga;
    }
    int getStok() {
        return stok;
    }
    void setHarga(double harga) {
        this.harga = harga;
    }
    void setStok(int stok) {
        this.stok = stok;
    }
    public void print(){
        System.out.println();
        System.out.println("Showroom Mobil");
    }

}
