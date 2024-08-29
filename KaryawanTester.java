//object class
import java.util.Scanner;
public class KaryawanTester {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("inputkan Nama Karyawan");
        String nama = input.nextLine();
        System.out.println("Inputkan ID Karyawan");
        int id = input.nextInt();
        System.out.println("Inputkan IPK");
        double ipk = input.nextDouble();

        Siswa reno = new Siswa (id, nama, ipk);
        reno.print();
        // object
        // Class object = new Construction
        Karyawan Burhan = new Karyawan(26,"Burhan","TU","TulungAgung");
        Karyawan azzam = new Karyawan(22,"azzam","Kesiswaan","malang");
        Karyawan Melvin = new Karyawan(21,"Melvin","TU","Malang");
        Karyawan moreno = new Karyawan(24,"moreno","Kesiswaan","bogor");
        Karyawan alvaro = new Karyawan(13,"alvaro","Kurikulum","Sidoarjo");

        Burhan.print();
        System.out.println();
        azzam.print();
        System.out.println();
        Melvin.print();
        System.out.println();
        moreno.print();
        System.out.println();
        alvaro.print();

        input.close();
    }
}