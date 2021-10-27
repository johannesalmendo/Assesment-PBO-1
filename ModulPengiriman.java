class ModulPengiriman {
    private String namaPenjual = "Eiger";
    private String alamatPenjual = "Bandung";
    private String namaPembeli;
    private String alamatPembeli;
    private String namaEkspedisi;
    private String noResi;
    private int noTransaksi;
    private String statusAsuransi;
    private String namaDropshipper;
    private String alamatDropshipper;
    private String statusDropshipper;
    private String jenis;
    private float ongkosKirim;
    private float nominalAsuransi;

    //1.data utama saja
    public ModulPengiriman(String jenis, int noTransaksi, String noResi, String namaEkspedisi, float ongkosKirim, String namaPenjual,
                           String alamatPenjual, String namaPembeli, String alamatPembeli){
        this.jenis = jenis;
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.ongkosKirim = ongkosKirim;
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
    }

    //2. data utama + data asuransi
    public ModulPengiriman(String jenis, int noTransaksi, String noResi, String namaEkspedisi, float ongkosKirim, String namaPenjual,
                           String alamatPenjual, String namaPembeli, String alamatPembeli, float nominalAsuransi,
                           String statusAsuransi){
        this.jenis = jenis;
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.ongkosKirim = ongkosKirim;
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.nominalAsuransi = nominalAsuransi;
        this.statusAsuransi = statusAsuransi;
    }

    //3. data utama + data dropshipper
    public ModulPengiriman(String jenis, int noTransaksi, String noResi, String namaEkspedisi, float ongkosKirim, String namaPenjual,
                           String alamatPenjual, String namaPembeli, String alamatPembeli, String namaDropshipper,
                           String statusDropshipper, String alamatDropshipper) {
        this.jenis = jenis;
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.ongkosKirim = ongkosKirim;
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.namaDropshipper = namaDropshipper;
        this.statusDropshipper = statusDropshipper;
        this.alamatDropshipper = alamatDropshipper;
    }

    //4. data utama + data asuransi + data dropshipper
    public ModulPengiriman(String jenis, int noTransaksi, String noResi, String namaEkspedisi, float ongkosKirim, String namaPenjual,
                           String alamatPenjual, String namaPembeli, String alamatPembeli, float nominalAsuransi,
                           String statusAsuransi , String namaDropshipper, String statusDropshipper, String alamatDropshipper) {
        this.jenis = jenis;
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.ongkosKirim = ongkosKirim;
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.nominalAsuransi = nominalAsuransi;
        this.statusAsuransi = statusAsuransi;
        this.namaDropshipper = namaDropshipper;
        this.statusDropshipper = statusDropshipper;
        this.alamatDropshipper = alamatDropshipper;

    }

    //print
    public void printAsuransiDropship(){
        System.out.println();
        System.out.println(jenis);
        System.out.println("No Transaksi : " + noTransaksi);
        System.out.println("No Resi : " + noResi);
        System.out.println("Nama Eskpedisi : " + namaEkspedisi);
        System.out.println("Ongkos Kirim : " + ongkosKirim);
        System.out.println("Nama Pengirim : " + namaDropshipper);
        System.out.println("Alamat Pengirim : " + alamatDropshipper);
        System.out.println("Nama Penerima : " + namaPembeli);
        System.out.println("Alamat Penerima : " +alamatPembeli);
        System.out.println("Nominal Asuransi : " + nominalAsuransi);
        System.out.println();
    }
    public void printAsuransi(){
        System.out.println(jenis);
        System.out.println("No Transaksi : " + noTransaksi);
        System.out.println("No Resi : " + noResi);
        System.out.println("Nama Eskpedisi : " + namaEkspedisi);
        System.out.println("Ongkos Kirim : " + ongkosKirim);
        System.out.println("Nama Pengirim : " + namaPenjual);
        System.out.println("Alamat Pengirim : " + alamatPenjual);
        System.out.println("Nama Penerima : " + namaPembeli);
        System.out.println("Alamat Penerima : " +alamatPembeli);
        System.out.println("Nominal Asuransi : " + nominalAsuransi);
        System.out.println();
    }
    public void printNormal(){
        System.out.println(jenis);
        System.out.println("No Transaksi : " + noTransaksi);
        System.out.println("No Resi : " + noResi);
        System.out.println("Nama Eskpedisi : " + namaEkspedisi);
        System.out.println("Ongkos Kirim : " + ongkosKirim);
        System.out.println("Nama Pengirim : " + namaPenjual);
        System.out.println("Alamat Pengirim : " + alamatPenjual);
        System.out.println("Nama Penerima : " + namaPembeli);
        System.out.println("Alamat Penerima : " + alamatPembeli);
        System.out.println();
    }
    public void printDropship(){
        System.out.println(jenis);
        System.out.println("No Transaksi : " + noTransaksi);
        System.out.println("No Resi : " + noResi);
        System.out.println("Nama Eskpedisi : " + namaEkspedisi);
        System.out.println("Ongkos Kirim : " + ongkosKirim);
        System.out.println("Nama Pengirim : " + namaDropshipper);
        System.out.println("Alamat Pengirim : " + alamatDropshipper);
        System.out.println("Nama Penerima : " + namaPembeli);
        System.out.println("Alamat Penerima : " +alamatPembeli);
        System.out.println();
    }
}
