package JavaBuAul.Modul2.Lat4;

public class Bus {
    //declaration variable
    private int penumpang, maxPenumpang;
    // membuat sebuah attribute/variable yang hanya bisa diakses pada class yang sama. 

    //constractor
    public Bus(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    // membuat sebuah konstruktor yang digunakan untuk memanggil attribute /variable maxpenumpang sehingga dapat diakses dalam class yang berbeda, dan menetapkan nilai 0 pada attribute/variable penumpang

    //setter (mutator method)
    public void addPenumpang(int penumpang) {
        int temp;
        temp = this.penumpang + penumpang;

        if (temp >= maxPenumpang) {
            System.out.println("Terlalu banyak penumpang");
        } else {
            this.penumpang = temp;
        }
    }
    // membuat sebuah method mutator (Setter) yang berfungsi untuk memanggil attribute/variable dari penumpang sehingga dapat diakses pada class yang berbeda, menambahkan nilai dari attribute/variable dan parameter penumpang dan dimasukkan ke dalam variable temp, dan melakukan pengkondisian yaitu  jika temp lebih besar daripada maxpenumpang, cetak String “Overload penumpang”, jika lebih kecil dari max penumpang maka tetapkan nilai penumpang = temp. 

    //getter (accesor method)
    public void getPassword(int password) {
        if (password == 20) {
            System.out.println("Password benar");
        } else {
            System.out.println("Password salah");
        }
    }
    //sebuah method accesor (getter) yg berfungsi untuk mengambil nilai dari variable password, dan melakukan pengondisian jika password == 20 maka cetak string "Password benar", jika Password != 20 cetak string "Password salah"
    
    //method
    public void cetak() {
        System.out.println("Penumpang sekarang = " + penumpang);
        System.out.println("Penumpang seharusnya adalah = " + maxPenumpang);
    }
    // membuat sebuah method Bernama cetak untuk mencetak nilai dari attribute/variable penumpang dan juga max penumpang.
}
