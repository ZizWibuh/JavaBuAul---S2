package JavaBuAul.Lat3;

public class TestSiswa {
    public static void main(String[] args) {
    EncapSiswa siswa = new EncapSiswa();
    siswa.setName("Aziz");
    siswa.setAge(16);
    siswa.setAddress("Malang");
    
    System.out.println("Nama: "+ siswa.getName() + "\nAlamat "+ siswa.getAddress() + "\nBerumur " + siswa.getAge() + " Tahun");
    }
}
