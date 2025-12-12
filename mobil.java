import java.util.Scanner;

public class mobil {
    Scanner input = new Scanner(System.in);
    private static int counter = 1; // auto increment
    public int id;
    public String merek;
    public String model;
    public String plat;
    public String kategori;
    public Boolean status;
    public double biayasewa;
    // public int idMobil;

    public mobil() {
        this.id = counter++;

    }

    public mobil(Boolean x) {
        status = x;
    }

    public void inputdatamobil() {

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
        System.out.print("Status (Tersedia/Tidak tersedia): ");
        String s = input.nextLine();
        input.nextLine();
        if (s.equalsIgnoreCase("tersedia")) {
            status = true;
        } else {
            status = false;
        }

    }

    public void tampildatamobil() {
        String s;
        if (status == true) {
            s = "Tersedia";
        } else {
            s = "Tidak tersedia";
            System.out.println("Id : " + id);
            System.out.println("Merek: " + merek);
            System.out.println("model: " + model);
            System.out.println("Nomor plat: " + plat);
            System.out.println("Kategori: " + kategori);
            System.out.println("Status: " + s);
            System.out.println("Biaya sewa: " + biayasewa);
        }

    }

    public void setstatus(Boolean x) {
        status = x;
    }

    public void setmerk(String x) {
        merek = x;
    }

    public void setmodel(String x) {
        model = x;
    }

    public void setplat(String x) {
        plat = x;
    }

    public void setkategori(String x) {
        kategori = x;
    }
}
