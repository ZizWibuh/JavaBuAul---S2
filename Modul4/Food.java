package Modul4;

public abstract class Food {
    //Bisa mengandung abstract dan non-abstract

    //Non-Abstract
    public void JenisMakanan(String jenis) {
        if (jenis.equalsIgnoreCase("Kuah")) {
            String Kuah[] = {"Soto","Rawon", "Sayur Asem", "Bakso"};
        } else if (jenis.equalsIgnoreCase("Goreng")) {
            String Goreng[] = {"Nasi Goreng", "Chiken Katsu", "Ayam Geprek", "Telur Barendo"};
        }
    }

    //Abstract
    public abstract void Harga();
}