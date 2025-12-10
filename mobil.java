import java.util.Scanner;
public class mobil {
    Scanner input = new Scanner(System.in);

    public String merek;
    public String model;
    public String plat;
    public String kategori;
    public Boolean status;
    public double biayasewa;

    public mobil(){
    }
    public mobil(Boolean x){
        status = x;
    }
    public void inputdatamobil(){

        System.out.print("Masukkan merek: ");
        merek = input.nextLine();
        System.out.print("Masukkan model: ");
        model = input.nextLine();
        System.out.print("Masukkan nomor plat: ");
        plat = input.nextLine();
        System.out.print("Masukkan kategori: ");
        kategori = input.nextLine();
        System.out.print("Biaya sewa: ");
        biayasewa = input.nextDouble();
        input.nextLine();
        System.out.print("Status (Tersedia/Tidak tersedia): ");
        String s = input.nextLine();
        if(s.equalsIgnoreCase("Tersedia")){
            status = true;
        }
        else{
            status = false;
        }

    }
    public void tampildatamobil(){
        String s = "s";
        if(status == true){
            s = "Tersedia";
        }
        else if(status == false){
            s = "Tidak tersedia";
        }
        System.out.println("Merek: "+merek);
        System.out.println("model: "+model);
        System.out.println("Nomor plat: "+plat);
        System.out.println("Kategori: "+kategori);
        System.out.println("Status: "+s);
        System.out.println("Biaya sewa: "+biayasewa);
    }
    public void setmerek(String x){
        merek = x;
    }
    public void setmodel(String x){
        model = x;
    }
    public void setplat(String x){
        plat = x;
    }
    public void setkategori(String x){
        kategori = x;
    }
    public void setbiayasewa(Double x){
        biayasewa = x;
    }
    public void setsts(Boolean x){
        status = x;
    }

}
