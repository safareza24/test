import java.util.Scanner;
public class menu {
    public int banyakmobil;
    public int banyakkaryawan;
    public mobil[] mbl;
    public karyawan[] kry;
    public Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String mobil;
        Scanner sc = new Scanner(System.in);
        menu app = new menu();
        Boolean n = false;

        do{
            System.out.println("");
            System.out.println("1.input data karyawan");
            System.out.println("2.input data mobil");
            System.out.println("3.tampilkan data karyawan");
            System.out.println("4.tampilkan data mobil");
            System.out.println("5.Update data karyawan");
            System.out.println("6.Update data mobil");
            System.out.println("7.delete data karyawan");
            System.out.println("8.delete data mobil");
            System.out.println("9.Pesan");
            System.out.println("10.Keluar");
            System.out.println("");
            System.out.print("Masukkan pilihan anda: ");
            int pil = sc.nextInt();

            if(pil == 1){
                app.createkaryawan();
            }
            else if(pil ==2){
                app.createmobil();
            }
            else if(pil == 3){
                app.readkaryawan();
            }
            else if(pil == 4){
                app.readmobil();
            }
            else if(pil == 5){
                app.updatekaryawan();
            }
            else if(pil == 6){
                app.updatemobil();
            }
            else if(pil == 10){
                n = true;
            }
        }while(n == false);

    }

    public void createmobil(){

        System.out.print("Masukkan banyak mobil: ");
        this.banyakmobil = input.nextInt();

        input.nextLine();
        this.mbl = new mobil[this.banyakmobil];
        System.out.println("");
        System.out.println("Input data mobil: ");
        for(int i=0;i<this.banyakmobil;i++){

            this.mbl[i] = new mobil();
            System.out.println("");
            System.out.println("Mobil "+(i+1)+": ");
            this.mbl[i].inputdatamobil();
        }
        
    }

    public void createkaryawan(){
        System.out.print("Masukan jumlah karyawan: ");
        this.banyakkaryawan = input.nextInt();

        input.nextLine();

        this.kry = new karyawan[this.banyakkaryawan];
        System.out.println("");
        System.out.println("Input data karyawan: ");
        for(int i=0;i<this.banyakkaryawan;i++){

            this.kry[i] = new karyawan();
            System.out.println("");
            System.out.println("Karyawan "+(i+1)+": ");
            this.kry[i].inputdatakaryawan();
        }
    }
    
    public void readkaryawan(){

        System.out.println("Data karyawan: ");
        for(int i=0;i<kry.length;i++){
            System.out.println("Karyawan "+(i+1)+": ");
            kry[i].tampildatakaryawan();
        }
    }
    
    public void readmobil(){

        System.out.println("Data mobil: ");
        for(int i=0;i<mbl.length;i++){
            System.out.println("");
            System.out.println("Mobil "+(i+1)+": ");
            mbl[i].tampildatamobil();
        }
    }
    public void updatekaryawan(){
        for(int i=0;i<banyakkaryawan;i++){
            System.out.println((i+1)+"."+kry[i].Nama);
        }
        System.out.println("Pilih karyawan berapa: ");
        int pil = input.nextInt();
        System.out.println("");

        input.nextLine();
        kry[pil-1].tampildatakaryawan();
        System.out.println("apa yang ingin anda ubah?");
        String p = input.nextLine();

        if(p.equalsIgnoreCase("nama")){
            System.out.println("");
            System.out.println("Masukkan nama yang baru: ");
            String namabaru = input.nextLine();
            kry[pil-1].setnama(namabaru);
        }
        else if(p.equalsIgnoreCase("alamat")){
            System.out.println("");
            System.out.println("Masukkan alamat yang baru: ");
            String alamatbaru = input.nextLine();
            kry[pil-1].setalamat(alamatbaru);
        }
        else if(p.equalsIgnoreCase("no.telepon")){
            System.out.println("");
            System.out.println("Masukkan no.telp yang baru: ");
            String telpbaru = input.nextLine();
            kry[pil-1].settelp(telpbaru);
        }
        else if(p.equalsIgnoreCase("kategori")){
            System.out.println("");
            System.out.println("Masukkan kategori yang baru: ");
            String kategoribaru = input.nextLine();
            kry[pil-1].setkategori(kategoribaru);
        }
        else if(p.equalsIgnoreCase("jenis kelamin")){
            System.out.println("");
            System.out.println("Masukkan jenis kelamin yang baru: ");
            char jkbaru = input.next().charAt(0);
            kry[pil-1].setjenisk(jkbaru);
        }
        else if(p.equalsIgnoreCase("status")){
            System.out.println("");
            System.out.println("Masukkan status yang baru: ");
            String sbaru = input.nextLine();

            if(sbaru.equalsIgnoreCase("hadir")){
                kry[pil-1].setstatus(true);
            }
            else{
                kry[pil-1].setstatus(false);
            }
            
        }
    }

    public void updatemobil(){
        for(int i=0;i<banyakmobil;i++){
            System.out.println((i+1)+"."+mbl[i].merek+mbl[i].model);
        }
        System.out.println("Pilih mobil berapa: ");
        int pil = input.nextInt();
        System.out.println("");

        input.nextLine();
        mbl[pil-1].tampildatamobil();
        System.out.println("apa yang ingin anda ubah?");
        String p = input.nextLine();

        if(p.equalsIgnoreCase("merek")){
            System.out.println("");
            System.out.println("Masukkan merek yang baru: ");
            String merekbaru = input.nextLine();
            mbl[pil-1].setmerek(merekbaru);
        }
        else if(p.equalsIgnoreCase("model")){
            System.out.println("");
            System.out.println("Masukkan model yang baru: ");
            String modelbaru = input.nextLine();
            mbl[pil-1].setmodel(modelbaru);
        }
        else if(p.equalsIgnoreCase("nomor plat")){
            System.out.println("");
            System.out.println("Masukkan nomor plat yang baru: ");
            String platbaru = input.nextLine();
            mbl[pil-1].setplat(platbaru);
        }
        else if(p.equalsIgnoreCase("kategori")){
            System.out.println("");
            System.out.println("Masukkan kategori yang baru: ");
            String kategoribaru = input.nextLine();
            mbl[pil-1].setkategori(kategoribaru);
        }
        else if(p.equalsIgnoreCase("biaya sewa")){
            System.out.println("");
            System.out.println("Masukkan biaya sewa yang baru: ");
            Double bsbaru = input.nextDouble();
            mbl[pil-1].setbiayasewa(bsbaru);
        }
        else if(p.equalsIgnoreCase("status")){
            System.out.println("");
            System.out.println("Masukkan status yang baru: ");
            String sbaru = input.nextLine();

            if(sbaru.equalsIgnoreCase("tersedia")){
                mbl[pil-1].setsts(true);
            }
            else{
                mbl[pil-1].setsts(false);
            }
            
        }
    }
}
