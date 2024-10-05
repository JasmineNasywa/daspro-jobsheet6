import java.util.Scanner;
public class latihan2pertemuan6daspro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int harga = 20000;
        double diskon1;
        double diskon2;
        int jumlahBuku;
        String namaBuku;
        int totalharga1sebelumdiskon;
        double totalharga1, totalharga2;
        double jumlahdiskon1, jumlahdiskon2;

        System.out.println("Masukkan nama buku : ");
        System.out.println("Tersedia : Kamus, Novel, Buku lain");
        namaBuku = sc.nextLine();
        System.err.println("Masukkan jumlah buku yang akan dibeli");
        jumlahBuku = sc.nextInt();

        totalharga1sebelumdiskon = harga * jumlahBuku;

        if (namaBuku.equalsIgnoreCase("Kamus")) {
            diskon1 = 0.1;
            jumlahdiskon1 = totalharga1sebelumdiskon * diskon1;
            totalharga1 = totalharga1sebelumdiskon - jumlahdiskon1;
            if (jumlahBuku > 2) {
                diskon2 = 0.02;
                jumlahdiskon2 = totalharga1 *diskon2;
                totalharga2 = totalharga1 - jumlahdiskon2;
            }
            else {
                jumlahdiskon2 = 0;
                totalharga2 = totalharga1;
            }

            
        } else if (namaBuku.equalsIgnoreCase("Novel")) {
            diskon1 = 0.07;
            jumlahdiskon1 = totalharga1sebelumdiskon * diskon1;
            totalharga1 = totalharga1sebelumdiskon - jumlahdiskon1;
            if (jumlahBuku > 3) {
                diskon2 = 0.02;
                jumlahdiskon2 = totalharga1 * diskon2;
                totalharga2 = totalharga1 - jumlahdiskon2;

            } else {
                diskon2 = 0.01;
                jumlahdiskon2 = totalharga1 * diskon2;
                totalharga2 = totalharga1 - jumlahdiskon2;
            }
        } else if (namaBuku.equalsIgnoreCase("Buku lain")) {
            if (jumlahBuku > 3) {
                jumlahdiskon1 = 0;
                diskon2 = 0.05;
                jumlahdiskon2 = totalharga1sebelumdiskon * diskon2;
                totalharga2 = totalharga1sebelumdiskon - jumlahdiskon2;
            } else {
                totalharga2 = totalharga1sebelumdiskon;
                jumlahdiskon1 = 0;
                jumlahdiskon2 = 0;
            }
        }else {
            System.out.println("Buku tidak tersedia.");
            jumlahdiskon1 = 0;
            jumlahdiskon2 = 0;
            totalharga2 = 0;
        }

        System.out.println("Jumlah diskon yang didapat = Rp.  " + jumlahdiskon1 + jumlahdiskon2);
        System.out.println("Harga yang harus dibayar = Rp " + totalharga2 );
    }
}
