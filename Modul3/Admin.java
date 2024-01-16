package JavaBuAul.Modul3;

public class Admin extends Karyawan {
    //Overriding
    public void tampilIdentitas(String profesi) {
        super.tampilIdentitas(profesi);
    }

    public void tampilNama() {
        //super.name = "Aziz";
        //super.gender = 'L';
        //super.noPeg = 000001;
        System.out.println("Nama: " + super.name);
        System.out.println("Gender: " + super.gender);
        System.out.println("Nomor Pegawai: " + super.noPeg);
    }

    public double gaji(double pokok) {
        return pokok;
    }

    public int gaji(int tunjangan) {
        return tunjangan;
    }
}
