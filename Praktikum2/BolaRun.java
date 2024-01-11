package JavaBuAul.Praktikum2;

import java.util.Scanner;

public class BolaRun {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BolaPraktikum run = new BolaPraktikum();

        double inputJariJari;

        inputJariJari = input.nextDouble();
        run.setJariJari(inputJariJari);

        System.out.println("Diameter: " + run.showDiameter());
        System.out.println("Luas permukaan: " + run.showLuasPermukaan());
        System.out.println("Volume: " + run.showVolume());

        input.close();
    }
}
