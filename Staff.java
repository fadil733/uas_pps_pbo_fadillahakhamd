public class Staff extends Pegawai
{
    private int jumlah_kehadiran;
    private final int TARIF_PERJAM = 50000;

    public Staff(){

    }

    public Staff (String nip, String nama, String alamat, String tanggal_lahir,
                  String jenis_kelamin, String tahun_masuk){
        super(nip, nama, alamat, tanggal_lahir, tahun_masuk, jenis_kelamin);
    }

    public void setKehadiran(int jumlah_kehadiran){
        this.jumlah_kehadiran=jumlah_kehadiran;
    }

    @Override
    public int getGaji(){
        int total_gaji=jumlah_kehadiran*TARIF_PERJAM;
        return total_gaji+super.getGaji();
    }
}
