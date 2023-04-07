public class Pegawai {
    private String nip;
    private String nama;
    private String alamat;
    private String tanggal_lahir;
    private String jenis_kelamin;
    private String tahun_masuk;

    public Pegawai(){

    }

    public Pegawai(String nip, String nama, String alamat, String tanggal_lahir,
                   String jenis_kelamin, String tahun_masuk)
    {
        this.nama=nama;
        this.nip=nip;
        this.alamat=alamat;
        this.tanggal_lahir=tanggal_lahir;
        this.jenis_kelamin=jenis_kelamin;
        this.tahun_masuk=tahun_masuk;
    }

    public void setNama(String nama){
        this.nama=nama;
    }

    public String getNama(){
        return this.nama;
    }

    public void setNip(String nip){
        this.nip=nip;
    }

    public String getNip(){
        return this.nip;
    }

    public void setJenis_kelamin(String jenis_kelamin){
        this.jenis_kelamin=jenis_kelamin;
    }

    public String getJenis_kelamin(){
        return this.jenis_kelamin;
    }

    public void setTanggal_lahir(String tanggal_lahir){
        this.tanggal_lahir=tanggal_lahir;
    }

    public String getTanggal_lahir(){
        return this.tanggal_lahir;
    }


    public void setTahun_masuk(String tahun_masuk){
        this.tahun_masuk=tahun_masuk;
    }

    public String getTahun_masuk(){
        return this.tahun_masuk;
    }

    public int getGaji(){
        return 2000000;
    }
}
