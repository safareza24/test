import java.util.Scanner;
public class karyawan {
    public String Nama;
    public String alamat;
    public String telp;
    public String kategori;
    public char jenisK;
    public Boolean status;
    Scanner input = new Scanner(System.in);

    public karyawan(){
    }
    public karyawan(Boolean x){
        status = x;
    }
    
    public void inputdatakaryawan(){
        System.out.print("Nama: ");
        Nama = input.nextLine();
        System.out.print("Alamat: ");
        alamat = input.nextLine();
        System.out.print("No.telepon: ");
        telp = input.nextLine();
        System.out.print("Kategori: ");
        kategori = input.nextLine();
        System.out.print("Jenis kelamin: ");
        jenisK = input.next().charAt(0);
        input.nextLine();
        System.out.print("Status (hadir/tidak): ");
        String s = input.nextLine();
        if(s.equals("hadir")){
            status = true;
        }
        else if (s.equals("tidak")){
            status = false;
        }
    }

    public void tampildatakaryawan(){
        String s;
        if(status == true){
            s = "hadir";
        }
        else{
            s = "Tidak hadir";
        }
        System.out.println("Nama: "+Nama);
        System.out.println("Alamat: "+alamat);
        System.out.println("No.telepon: "+telp);
        System.out.println("Kategori: "+kategori);
        System.out.println("Jenis kelamin: "+jenisK);
        System.out.println("Status: "+s);
    }
    public void setstatus(Boolean x){
        status = x;
    }
    public void setnama(String x){
        Nama = x;
    }
    public void setalamat(String x){
        alamat = x;
    }
    public void settelp(String x){
        telp = x;
    }
    public void setkategori(String x){
        kategori = x;
    }
    public void setjenisk(char x){
        jenisK = x;
        //adit neckhut
    }
    //safares
}
