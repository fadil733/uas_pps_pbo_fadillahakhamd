public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int jumlahPegawaiSekarang = 0;

    public DaftarGaji(int jumlah_pegawai){
        listPegawai = new Pegawai[jumlah_pegawai];
    }

    public void addPegawai(Pegawai p){
        listPegawai[jumlahPegawaiSekarang] = p;
        jumlahPegawaiSekarang++;
    }

    public void printSemuaGaji(){
        for (int i=0;i<jumlahPegawaiSekarang;i++){
            System.out.print("Nama: " + listPegawai[i].getNama());
            System.out.print(" ,Nip: " + listPegawai[i].getNip());
            System.out.print(" ,Kelamin: " + listPegawai[i].getJenis_kelamin());
            System.out.print(" ,Tanggal Lahir: " + listPegawai[i].getTanggal_lahir());
            System.out.println(" ,Mendapatkan Gaji:" + listPegawai[i].getGaji());
        }

    }

}
