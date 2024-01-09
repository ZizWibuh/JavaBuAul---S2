package JavaBuAul;

public class CarView {
    public static void main(String[] args) {
        Car main = new Car();
        main.setMerk("Nissan");
        main.settopSpeed(230);

        System.out.println("Merk: " + main.getMerk());
        System.out.println("Top Speed: " + main.gettopSpeed() + " Mph");
        System.out.println("Made in " + main.negaraAsal);
    }
}
