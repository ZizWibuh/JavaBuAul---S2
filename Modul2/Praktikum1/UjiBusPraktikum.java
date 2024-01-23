package Modul2.Praktikum1;

public class UjiBusPraktikum {
    public static void main(String[] args) {
        
        BusPraktikum busMini = new BusPraktikum(10);
        busMini.addPenumpang(6);
        busMini.cetak();

        busMini.addPenumpang(4);
        busMini.cetak();

        busMini.getPenumpang(10);
        busMini.cetak();

        busMini.getPenumpang(12);
        busMini.cetak();

        busMini.getAverage();
        busMini.cetak();
    }
}