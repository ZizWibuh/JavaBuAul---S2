package JavaBuAul.Praktikum2;

import java.util.Scanner;

public class BolaRun {
    public static void main(String[] args) {

        double inputJariJari;

        Scanner input = new Scanner(System.in);
        BolaPraktikum run = new BolaPraktikum();

        inputJariJari = input.nextDouble();
        run.setJariJari(inputJariJari);

        System.out.println("Diameter: " + run.showDiameter());
        System.out.println("Luas permukaan: " + run.showLuasPermukaan());
        System.out.println("Volume: " + run.showVolume());

        input.close();
    }
}
