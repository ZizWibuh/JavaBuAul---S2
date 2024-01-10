package JavaBuAul.Praktikum1;

public class BusPraktikum {
    //declaration variable / attribute
    private double penumpang, maxPenumpang, counter, penumpangBaru;

    //Constractor
    public BusPraktikum(double maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
        counter = 0;
        penumpangBaru = 0;
    }

    //Setter (Mutator method)
    public void addPenumpang(double penumpang) {
        double temp;
        temp = this.penumpang + penumpang;
        if (temp >= maxPenumpang) {
            System.out.println("Penumpang terlalu banyak");
        } else {
            this.penumpang = temp;
            counter++;
            penumpangBaru += penumpang;
        }
    }

    //Getter (Accesor method)
    public void getPenumpang(double penumpang) {
        double temp;
        temp = this.penumpang - penumpang;
        if (temp < 0) {
            System.out.println("Penumpang tidak boleh kurang dari 0");
        } else {
            this.penumpang = temp;
            counter--;
            penumpangBaru -= penumpang;
        }
    }

    public double getAverage() {
        if (counter == 0) {
            return 0;
        } else {
            return penumpangBaru / counter;
        }
    }

    public void cetak() {
        System.out.println("Penumpang sekarang = " + penumpang);
        System.out.println("Penumpang Seharusnya = " +maxPenumpang);
        System.out.println("Rata-rata berat penumpang = " +getAverage() + "\n");
    }
}
