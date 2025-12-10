import java.util.Scanner;

public class menu {
    public int banyakmobil;
    public int banyakkaryawan;
    public mobil[] mbl;
    public karyawan[] kry;
    public pesan psn;
    public Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String mobil;
        Scanner sc = new Scanner(System.in);
        menu app = new menu();
        Boolean n = false;
        int pilh;

        do {
            System.out.println("");
            System.out.println("Sistem travel ");
            System.out.println("Silahkan pilih menu");
            System.out.println("1. Sistem Inventory");
            System.out.println("2. Pemesanan tour dan travel");
            System.out.println("3. Exit");
            System.out.print("Opsi : ");
            pilh = sc.nextInt();
            if (pilh == 1) {
                do {
                    System.out.println("");
                    System.out.println("1. Input data karyawan");
                    System.out.println("2. Input data mobil");
                    System.out.println("3. Tampilkan data karyawan");
                    System.out.println("4. Tampilkan data mobil");
                    System.out.println("5. Update data karyawan");
                    System.out.println("6. Update data mobil");
                    System.out.println("7. Delete data karyawan");
                    System.out.println("8. Delete data mobil");
                    System.out.println("9. Delete data mobil");
                    System.out.println("10. Kembali");
                    System.out.print("Masukkan pilihan anda: ");
                    int pil = sc.nextInt();

                    if (pil == 1) {
                        app.createkaryawan();
                    } else if (pil == 2) {
                        app.createmobil();
                    } else if (pil == 3) {
                        app.readkaryawan();
                    } else if (pil == 4) {
                        app.readmobil();
                    } else if (pil == 5) {
                        app.updatekaryawan();
                    } else if (pil == 9) {
                        n = true;
                    } else if (pil == 10) {
                        break;
                    }
                } while (n == false);
            }

            else if (pilh == 2) {
                int pil;
                do {


//   git config --global user.email "you@example.com"
//   git config --global user.name "Your Name"

                    System.out.println("");
                    System.out.println("Menu tour dan travel");
                    System.out.println("1. Pesan Travel");
                    System.out.println("2. Sewa Mobil");
                    System.out.println("5. Kembali");
                    System.out.print("Masukkan pilihan anda: ");
                    pil = sc.nextInt();

                    if (pil == 1) {
                        System.out.println("");
                        System.out.println("Pesan Travel");
                        System.out.println("Rute yang tersedia : ");
                        System.out.println("1. Surabaya - Malang");
                        System.out.println("2. Madura - Malang");
                        System.out.println("3. Banyuwangi - Malang");
                        System.out.println("4. Situbondo - Malang");
                        System.out.println("5. Tulungagung - Malang");
                        System.out.println("6. Kembali")
                        System.out.print("Pilihan rute anda (nomor saja): ");
                        int rute = sc.nextInt();
                        do {
                            if (rute==1)
                        }

                    } else if (pil == 2) {
                        System.out.println("");
                        System.out.println("Sewa Mobil");
                    } else if (pil == 5) {
                        break;
                    } else {
                        System.out.println("");
                        System.out.println("Invalid");
                    }

                } while (pil != 5);

            }

            else if (pilh == 3) {
                System.out.println("");
                System.out.println("Terima kasih telah menggunakan program");
            } else {
                System.out.println("");
                System.out.println("Invalid");
            }
        } while (pilh != 3);
    }

    public void createmobil() {
        System.out.print("Masukkan banyak mobil: ");
        this.banyakmobil = input.nextInt();

        input.nextLine();

        this.mbl = new mobil[this.banyakmobil];
        System.out.println("Input data mobil: ");
        for (int i = 0; i < this.banyakmobil; i++) {

            this.mbl[i] = new mobil();
            System.out.print("Mobil " + (i + 1) + ": ");
            this.mbl[i].inputdatamobil();
        }
    }

    public void createkaryawan() {
        System.out.print("Masukan jumlah karyawan: ");
        this.banyakkaryawan = input.nextInt();

        input.nextLine();

        this.kry = new karyawan[this.banyakkaryawan];

        System.out.println("Input data karyawan: ");
        for (int i = 0; i < this.banyakkaryawan; i++) {

            this.kry[i] = new karyawan();
            System.out.println("Karyawan " + (i + 1) + ": ");
            this.kry[i].inputdatakaryawan();
        }
    }

    public void readkaryawan() {

        System.out.println("Data karyawan: ");
        for (int i = 0; i < kry.length; i++) {
            System.out.println("Karyawan " + (i + 1) + ": ");
            kry[i].tampildatakaryawan();
        }
    }

    public void readmobil() {

        System.out.println("Data mobil: ");
        for (int i = 0; i < kry.length; i++) {
            System.out.println("Karyawan " + (i + 1) + ": ");
            mbl[i].tampildatamobil();
        }
    }

    public void updatekaryawan() {
        for (int i = 0; i < banyakkaryawan; i++) {
            System.out.println((i + 1) + kry[i].Nama);
        }
        System.out.println("Pilih karyawan berapa: ");
        int pil = input.nextInt();
        System.out.println("");

        input.nextLine();
        kry[pil - 1].tampildatakaryawan();
        System.out.println("apa yang ingin anda ubah?");
        String p = input.nextLine();

        if (p.equalsIgnoreCase("nama")) {
            System.out.println("");
            System.out.println("Masukkan nama yang baru: ");
            String namabaru = input.nextLine();
            kry[pil - 1].setnama(namabaru);
        } else if (p.equalsIgnoreCase("alamat")) {
            System.out.println("");
            System.out.println("Masukkan alamat yang baru: ");
            String alamatbaru = input.nextLine();
            kry[pil - 1].setalamat(alamatbaru);
        } else if (p.equalsIgnoreCase("no.telepon")) {
            System.out.println("");
            System.out.println("Masukkan no.telp yang baru: ");
            String telpbaru = input.nextLine();
            kry[pil - 1].settelp(telpbaru);
        } else if (p.equalsIgnoreCase("kategori")) {
            System.out.println("");
            System.out.println("Masukkan kategori yang baru: ");
            String kategoribaru = input.nextLine();
            kry[pil - 1].setkategori(kategoribaru);
        } else if (p.equalsIgnoreCase("jenis kelamin")) {
            System.out.println("");
            System.out.println("Masukkan jenis kelamin yang baru: ");
            char jkbaru = input.next().charAt(0);
            kry[pil - 1].setjenisk(jkbaru);
        } else if (p.equalsIgnoreCase("status")) {
            System.out.println("");
            System.out.println("Masukkan status yang baru: ");
            String sbaru = input.nextLine();

            if (sbaru.equalsIgnoreCase("hadir")) {
                kry[pil - 1].setstatus(true);
            } else {
                kry[pil - 1].setstatus(false);
            }

        }
    }
}
