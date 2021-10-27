public class Main {
    public static void main(String[] args) {
        //Asuransi dan Dropship
        ModulPengiriman asuransiDropship = new ModulPengiriman("Asuransi dan Dropsip", 1, "N0001",
                "JNE", 21000, "Desta", "Surabaya", "Gina",
                "Jakarta", 40000, "Aktif", "Dropship1",
                "Aktif", "Surabaya");
        asuransiDropship.printAsuransiDropship();

        //Asuransi
        ModulPengiriman asuransi = new ModulPengiriman("Asuransi", 2, "N0003",
                "J&T", 16000, "Eiger", "Bandung Kopo", "Gina",
                "Jakarta", 40000, "Aktif");
        asuransi.printAsuransi();

        //Normal
        ModulPengiriman normal = new ModulPengiriman("Normal", 3, "N0004", "Pos Indonesia",
                23000, "Eiger", "Bandung Kopo", "Gina","Jakarta");
        normal.printNormal();

        //Dropship
        ModulPengiriman dropshipper = new ModulPengiriman("Dropship", 4, "N0002",
                "siCepat", 24000, "Desta", "Manado", "Gina",
                "Jakarta", "Dropship2", "Aktif", "Manado");
        dropshipper.printDropship();
    }
}
