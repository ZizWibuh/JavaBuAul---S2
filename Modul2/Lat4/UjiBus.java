package JavaBuAul.Modul2.Lat4;

public class UjiBus {
    public static void main(String[] args) {
        
        Bus busMini = new Bus(10);
        busMini.getPassword(40);
        busMini.getPassword(90);
        busMini.cetak();

        busMini.addPenumpang(3);
        busMini.cetak();

        busMini.addPenumpang(1);
        busMini.cetak();

        busMini.addPenumpang(1);
        busMini.cetak();
    }
}
