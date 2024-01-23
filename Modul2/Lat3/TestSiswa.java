package Modul2.Lat3;

import java.util.Scanner;

public class TestSiswa {
    public static void main(String[] args) {
    EncapSiswa siswa = new EncapSiswa();
    Scanner main = new Scanner(System.in);

    System.out.print("Masukkan Nama: ");
    String name = main.next();
    System.out.print("Masukkan Umur: ");
    int age = main.nextInt();
    System.out.print("Masukan Alamat: ");
    String address = main.next();

    siswa.setName(name);
    siswa.setAge(age);
    siswa.setAddress(address);
    
    System.out.println("Nama: "+ siswa.getName() + "\nBerumur: "+ siswa.getAge() + " Tahun" + "\nAlamat: " + siswa.getAddress());

    main.close();
    }
}
