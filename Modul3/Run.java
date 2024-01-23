package Modul3;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Admin run = new Admin();
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        run.name = input.next();
        System.out.print("Masukkan Jenis Kelamin: ");
        run.gender = input.next().charAt(0);
        System.out.print("Masukkan Nomor Pegawai: ");
        run.noPeg = input.nextInt();

        run.tampilIdentitas("Programmer");
        run.tampilNama();
        System.out.println("Gaji pokok: " + run.gaji(5000000));
        System.out.println("Tunjangan: " + run.gaji(2500000));
    }
}
