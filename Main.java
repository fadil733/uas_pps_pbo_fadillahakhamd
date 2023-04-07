// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.\

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        Staff s1=new Staff();
        s1.setNama("Bagus");
        s1.setNip("5456545");
        s1.setJenis_kelamin("laki-laki");
        s1.setTanggal_lahir("19 mei 1995");
        s1.setTahun_masuk("2015");
        s1.setKehadiran(10);

        dosen d1 = new dosen();
        d1.setNama("Abdul");
        s1.setNip("5456545");
        s1.setJenis_kelamin("laki-laki");
        s1.setTanggal_lahir("19 mei 1995");
        s1.setTahun_masuk("2015");
        d1.setSKS(20);


        DaftarGaji daftar_gaji=new DaftarGaji(3);
        daftar_gaji.addPegawai(s1);
        daftar_gaji.addPegawai(d1);
        daftar_gaji.addPegawai(p1);
        daftar_gaji.printSemuaGaji();
    }
}