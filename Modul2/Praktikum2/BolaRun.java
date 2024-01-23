package Modul2.Praktikum2;

import java.util.Scanner;

public class BolaRun {
    public static void main(String[] args) {
        //declaration variable
        double inputJariJari;

        //Calling class BolaPraktikum
        BolaPraktikum run = new BolaPraktikum();

        //declaration Scanner input
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai Jari-jari: ");
        //input Jari-jari
        inputJariJari = input.nextDouble();
        run.setJariJari(inputJariJari);

        //print diameter, surface area, and volume
        System.out.println("Diameter: " + run.showDiameter());
        System.out.println("Luas permukaan: " + run.showLuasPermukaan());
        System.out.println("Volume: " + run.showVolume());

        //close Scanner input
        input.close();
    }
}
