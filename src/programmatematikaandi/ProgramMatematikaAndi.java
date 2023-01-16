package programmatematikaandi;

import java.util.Scanner;

public class ProgramMatematikaAndi {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        boolean kondisi = true;
        int deret, beda;
        int angka = 1,
                angka2 = 1,
                angka3 = 1;

        while (kondisi) {

            System.out.println("Belajar Deret Aritmatika, Geometri, dan Menghitung Faktorial");
            System.out.println("");
            System.out.print("Masukan banyak angka yang mau dicetak [2..10]: ");
            deret = in.nextInt();

            System.out.print("Masukan beda masing-masing angka [2..9]: ");
            beda = in.nextInt();

            System.out.println("");

//        deret aritmatika
            System.out.println("Deret Aritmatika :");
            for (int x = 1; x <= deret; x++) {
                System.out.print(angka + " ");
                angka += beda;
            }

            System.out.println("");
            System.out.println("");

//        deret geometri
            System.out.println("Deret Geometri   :");
            for (int y = 1; y <= deret; y++) {
                System.out.print(angka2 + " ");
                angka2 *= beda;
            }

            System.out.println("");
            System.out.println("");

//        deret faktorial
            System.out.println("Faktorial dari " + deret + " :");
            int hasil = deret;
            for (int z = deret; z > 0; z--) {
                System.out.print(z);
                if (z > 1) {
                    System.out.print(" * ");
                }
                if (deret != z) {
                    hasil *= z;
                }
            }
            System.out.print(" = " + hasil);

            System.out.println("");

            System.out.println("");
            System.out.print("Apakah Anda ingin mengulang [y/t]: ");
            String loop = in.next();

            if (loop.equalsIgnoreCase("t")) {
                System.out.println("");
                System.out.println("Terima kasih telah menggunakan program ini...");
                kondisi = false;

            }
        }

    }

}
