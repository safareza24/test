import java.util.Scanner;
import java.util.ArrayList;

public class menu {
    public int banyakmobil;
    public int banyakkaryawan;
    public ArrayList<mobil> mbl = new ArrayList<>();
    public ArrayList<karyawan> kry = new ArrayList<>();
    public pesan psn;
    public Scanner input = new Scanner(System.in);
    public int idMbl = 1;
    public int idKyw = 1;

    public static void main(String[] args) {
        String mobil;
        Scanner sc = new Scanner(System.in);
        menu app = new menu();
        pesan psn = new pesan();
        Boolean n = false;
        int pilh;

        do {
            System.out.println("");
            System.out.println("Sistem travel ");
            System.out.println("Silahkan pilih menu");
            System.out.println("1. Sistem Inventory");
            System.out.println("2. Pemesanan tour dan travel");
            System.out.println("3. Keluar Program");
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
                    } else if (pil == 6) {
                        app.updatemobil();
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
                        System.out.println("6. Kembali");
                        System.out.print("Pilihan rute anda (nomor saja): ");
                        int rute = sc.nextInt();
                        if (rute == 6) {
                            continue;
                        }

                        if (rute < 1 || rute > 5) {
                            System.out.println("Invalid");
                            continue;
                        }

                        System.out.println("Anda memilih rute nomor: " + rute);

                        if (app.mbl == null || app.kry == null) {
                            System.out.println("Data mobil atau karyawan belum diinput!");
                        } else {
                            psn.pesanTravel(app.mbl, app.kry);
                        }

                    } else if (pil == 2) {
                        System.out.println("");
                        System.out.println("Sewa Mobil");

                        if (app.mbl == null) {
                            System.out.println("Data mobil belum diinput!");
                        } else {
                            psn.sewaMobil(app.mbl);
                        }
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

    // add data 1 satu
    public void createmobil() {
        mobil m = new mobil();
        System.out.println("Input data untuk Mobil ID : " + idMbl);
        m.inputdatamobil();
        mbl.add(m);
        idMbl++;
    }

    public void createkaryawan() {
        karyawan k = new karyawan();
        System.out.println("Input data untuk Karyawan ID : " + idKyw);
        k.inputdatakaryawan();
        kry.add(k);
        // k.idKaryawan++;
        idKyw++;
    }

    public void readkaryawan() {
        if (kry.isEmpty()) {
            System.out.println("Belum ada data karyawan!");
            return;
        }

        System.out.println("Data karyawan:");
        int idk = 1;
        for (karyawan k : kry) {
            System.out.println("Id : " + idk);
            k.tampildatakaryawan();
            System.out.println("");
            idk++;
        }
    }

    public void readmobil() {
        if (mbl.isEmpty()) {
            System.out.println("Belum ada data mobil!");
            return;
        }

        System.out.println("Data mobil:");
        int idm = 1;
        for (mobil m : mbl) {
            System.out.println("Id : " + idm);
            m.tampildatamobil();
            System.out.println("");
            idm++;
        }
    }

    public void updatekaryawan() {

        System.out.println("Data karyawan:");
        int idk = 1;
        for (karyawan k : kry) {
            System.out.println("Id : " + idk);
            k.tampildatakaryawan();
            System.out.println("");
            idk++;
        }

        System.out.println("Pilih karyawan berapa: ");
        int pil = input.nextInt();
        System.out.println("");

        input.nextLine();
        kry.get(pil - 1).tampildatakaryawan();
        System.out.println("apa yang ingin anda ubah?");
        String p = input.nextLine();

        if (p.equalsIgnoreCase("nama")) {
            System.out.println("");
            System.out.println("Masukkan nama yang baru: ");
            String namabaru = input.nextLine();
            kry.get(pil - 1).setnama(namabaru);
        } else if (p.equalsIgnoreCase("alamat")) {
            System.out.println("");
            System.out.println("Masukkan alamat yang baru: ");
            String alamatbaru = input.nextLine();
            kry.get(pil - 1).setalamat(alamatbaru);
        } else if (p.equalsIgnoreCase("no.telepon")) {
            System.out.println("");
            System.out.println("Masukkan no.telp yang baru: ");
            String telpbaru = input.nextLine();
            kry.get(pil - 1).settelp(telpbaru);
        } else if (p.equalsIgnoreCase("kategori")) {
            System.out.println("");
            System.out.println("Masukkan kategori yang baru: ");
            String kategoribaru = input.nextLine();
            kry.get(pil - 1).setkategori(kategoribaru);
        } else if (p.equalsIgnoreCase("jenis kelamin")) {
            System.out.println("");
            System.out.println("Masukkan jenis kelamin yang baru: ");
            char jkbaru = input.next().charAt(0);
            kry.get(pil - 1).setjenisk(jkbaru);
        } else if (p.equalsIgnoreCase("status")) {
            System.out.println("");
            System.out.println("Masukkan status yang baru: ");
            String sbaru = input.nextLine();

            if (sbaru.equalsIgnoreCase("hadir")) {
                kry.get(pil - 1).setstatus(true);
            } else {
                kry.get(pil - 1).setstatus(false);
            }
        }
    }

    public void updatemobil() {

        System.out.println("Data mobil:");
        int idm = 1;
        for (mobil m : mbl) {
            System.out.println("Id : " + idm);
            m.tampildatamobil();
            System.out.println("");
            idm++;
        }
        System.out.println("Pilih mobil mana: ");
        int pil = input.nextInt();
        System.out.println("");

        input.nextLine();
        mbl.get(pil - 1).tampildatamobil();
        System.out.println("apa yang ingin anda ubah?");
        String p = input.nextLine();

        if (p.equalsIgnoreCase("merk")) {
            System.out.println("");
            System.out.println("Masukkan merk yang baru: ");
            String merkbaru = input.nextLine();
            input.nextLine();
            mbl.get(pil - 1).setmerk(merkbaru);
        } else if (p.equalsIgnoreCase("model")) {
            System.out.println("");
            System.out.println("Masukkan model yang baru: ");
            String modelbaru = input.nextLine();
            input.nextLine();
            mbl.get(pil - 1).setmodel(modelbaru);
        } else if (p.equalsIgnoreCase("plat")) {
            System.out.println("");
            System.out.println("Masukkan no.plat yang baru: ");
            String platbaru = input.nextLine();
            input.nextLine();
            mbl.get(pil - 1).setplat(platbaru);
        } else if (p.equalsIgnoreCase("kategori")) {
            System.out.println("");
            System.out.println("Masukkan kategori yang baru: ");
            String kategoribaru = input.nextLine();
            input.nextLine();
            mbl.get(pil - 1).setkategori(kategoribaru);
        } else if (p.equalsIgnoreCase("status")) {
            System.out.println("");
            System.out.println("Masukkan status yang baru: ");
            String sbaru = input.nextLine();
            input.nextLine();

            if (sbaru.equalsIgnoreCase("tersedia")) {
                kry.get(pil - 1).setstatus(true);
            } else {
                kry.get(pil - 1).setstatus(false);
            }
        }
    }
}
// almond eyes my beloved 💖🐴🌰👀
