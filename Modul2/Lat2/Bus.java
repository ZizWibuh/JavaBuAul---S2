package JavaBuAul.Modul2.Lat2;

public class Bus {
    private int penumpang, maxpenumpang;

    //constructor
    public Bus(int maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }

    //mutator method
    public void plusPenumpang(int penumpang) {
        int temp;
        temp = this.penumpang + penumpang;
        if (temp >= maxpenumpang) {
            System.out.println("Penumpang terlalu banyak");
        } else {
            this.penumpang = temp;
        }
    }

    public void cetak() {
        System.out.println("Penumpang sekarang = " + penumpang);
        System.out.println("Penumpang seharusnya adalah = " + maxpenumpang);
    }
}
