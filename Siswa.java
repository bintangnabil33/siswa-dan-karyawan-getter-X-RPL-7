//Object class
public class Siswa {
    int id;
    String nama;
    double ipk;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getIpk() {
        return this.ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    //Constructor, digunakan utk membangun objek
    //nama harus sama dgn Class
    public Siswa() {
        id = 0;
        nama = "kosong";
        ipk = 0.0;
    }

    //Constructor Parameter
    public Siswa(int id, String nama, double ipk) {
        //variabel = parameter
       this. id = id;
       this. nama = nama;
       this. ipk =ipk;
    }

    //method print
    public void print(){
        
    }
}
