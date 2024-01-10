package JavaBuAul.Praktikum2;

public class BolaPraktikum {
    //declaration variable
    private double jariJari;

    //constractor
    public BolaPraktikum() {
        jariJari = 0;
    }

    //Setter (Mutator method)
    public void setJariJari(double jariJari) {
        if (jariJari > 0) {
            this.jariJari = jariJari;
        } else {
            System.out.println("Jari-jari harus lebih dari 0");
        }
    }

    //Getter (Accesor method)
    public double showDiameter() {
        return 2 * jariJari;
    }

    public double showLuasPermukaan() {
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }

    public double showVolume() {
        return (4/3) * Math.PI * Math.pow(jariJari, 3);
    }

    public static void main(String[] args) {
        double jariJariVar = 3;

        BolaPraktikum main = new BolaPraktikum();
        System.out.println("Diameter: " + main.showDiameter());
        System.out.println("Luas Permukaan: " + main.showLuasPermukaan());
        System.out.println("Volume: " + main.showVolume());
        
        main.setJariJari(jariJariVar);
        System.out.println("After");
        System.out.println("Diameter: " + main.showDiameter());
        System.out.println("Luas Permukaan: " + main.showLuasPermukaan());
        System.out.println("Volume: " + main.showVolume());
    }
}