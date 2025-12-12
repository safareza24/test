import java.util.ArrayList;
import java.util.Scanner;

public class pesan {
    Scanner input = new Scanner(System.in);

    public void pesanTravel(ArrayList<mobil> mbl, ArrayList<karyawan> kry) {

        int pilMobil;
        while (true) {
            System.out.println("Pilih mobil :");
            for (int i = 0; i < mbl.size(); i++) {
                System.out.println((i + 1) + ". ");
                mbl.get(i).tampildatamobil();
                System.out.println();
            }

            pilMobil = input.nextInt();
            input.nextLine();

            if (mbl.get(pilMobil - 1).status == true) {
                break;
            } else {
                System.out.println("Mobil sedang tidak tersedia, pilih mobil lain.");
            }
        }

        int pilKaryawan;
        while (true) {
            System.out.println("Pilih Driver :");
            for (int i = 0; i < kry.size(); i++) {
                System.out.println((i + 1) + ". ");
                kry.get(i).tampildatakaryawan();
                System.out.println();
            }

            pilKaryawan = input.nextInt();
            input.nextLine();

            if (kry.get(pilKaryawan - 1).status == true) {
                break;
            } else {
                System.out.println("Driver sedang tidak tersedia, pilih driver lain.");
            }
        }

        mbl.get(pilMobil - 1).status = false;
        kry.get(pilKaryawan - 1).status = false;

        System.out.println("Travel berhasil dipesan.");
    }

    public void sewaMobil(ArrayList<mobil> mbl) {

        int pilMobil;
        while (true) {
            System.out.println("Pilih mobil:");
            for (int i = 0; i < mbl.size(); i++) {
                System.out.println((i + 1) + ". ");
                mbl.get(i).tampildatamobil();
                System.out.println();
            }

            pilMobil = input.nextInt();
            input.nextLine();

            if (mbl.get(pilMobil - 1).status == true) {
                break;
            } else {
                System.out.println("Mobil sedang tidak tersedia, pilih mobil lain.");
            }
        }

        mbl.get(pilMobil - 1).status = false;

        System.out.println("Mobil berhasil disewa.");
    }

}