package JavaBuAul.Modul2;

public class Car {
    private String merk;
    private int topSpeed;
    protected String negaraAsal = "Japan";


public void setMerk (String merk) {
    this.merk = merk;
}
public String getMerk() {
    return merk;
}

public void settopSpeed (int topSpeed) {
    this.topSpeed = topSpeed;
}
public int gettopSpeed() {
    return topSpeed;
}

}