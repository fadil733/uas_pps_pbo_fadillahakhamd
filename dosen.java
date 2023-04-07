public class dosen extends Pegawai {
    private int jumlahSKS;
    private final int TARIF_SKS = 100000;

    public dosen() {

    }

    public dosen(String nip, String nama, String alamat, String tanggal_lahir,
                 String jenis_kelamin, String tahun_masuk) {
        super(nip, nama, alamat, tanggal_lahir, tahun_masuk, jenis_kelamin);
    }

    public void setSKS(int SKS) {
        this.jumlahSKS = SKS;
    }

    @Override
    public int getGaji() {
        int total_gaji = jumlahSKS * TARIF_SKS;
        return total_gaji + super.getGaji();
    }
}

