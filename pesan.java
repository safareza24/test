import java.util.Scanner;

public class pesan {
    Scanner input = new Scanner(System.in);

    public void pesanTravel(mobil[] mbl, karyawan[] kry) {

        int pilMobil;
        while (true) {
            System.out.println("Pilih mobil :");
            for (int i = 0; i < mbl.length; i++) {
                System.out.println((i + 1) + ". ");
                mbl[i].tampildatamobil();
                System.out.println();
            }

            pilMobil = input.nextInt();
            input.nextLine();

            if (mbl[pilMobil - 1].status == true) {
                break;
            } else {
                System.out.println("Mobil sedang tidak tersedia, pilih mobil lain.");
            }
        }

        int pilKaryawan;
        while (true) {
            System.out.println("Pilih Driver :");
            for (int i = 0; i < kry.length; i++) {
                System.out.println((i + 1) + ". ");
                kry[i].tampildatakaryawan();
                System.out.println();
            }

            pilKaryawan = input.nextInt();
            input.nextLine();

            if (kry[pilKaryawan - 1].status == true) {
                break;
            } else {
                System.out.println("Driver sedang tidak tersedia, pilih driver lain.");
            }
        }

        mbl[pilMobil - 1].status = false;
        kry[pilKaryawan - 1].status = false;

        System.out.println("Travel berhasil dipesan.");
    }

    public void sewaMobil(mobil[] mbl) {

        int pilMobil;
        while (true) {
            System.out.println("Pilih mobil:");
            for (int i = 0; i < mbl.length; i++) {
                System.out.println((i + 1) + ". ");
                mbl[i].tampildatamobil();
                System.out.println();
            }

            pilMobil = input.nextInt();
            input.nextLine();

            if (mbl[pilMobil - 1].status == true) {
                break;
            } else {
                System.out.println("Mobil sedang tidak tersedia, pilih mobil lain.");
            }
        }

        mbl[pilMobil - 1].status = false;

        System.out.println("Mobil berhasil disewa.");
    }

}