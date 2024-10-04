import java.util.Scanner;
public class pemilihan2percobaan212 {
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        int pilihan_menu;
        String member;
        double diskon;
        int harga ;
        double total_bayar;
        int pembayaran;
        double total;

        System.out.println("-------------------------");
        System.out.println("===== MENU KEFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("----------------------------------");
        System.out.println("Masukkan angka dari menu yang di pilih = ");
        pilihan_menu = input12.nextInt();
        input12.nextLine();
        System.out.println("Apakah punya member (y/n) ? =");
        member = input12.nextLine();
        System.out.println("-----------------------------------");


        if (member.equals("y")){
            diskon = 0.10;
            System.out.println("Besar diskon 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga rice bowl = " + harga);
            
            } else if (pilihan_menu == 2){
                harga = 3000;
                System.out.println("Harga Ice Tea =" + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling =" + harga);

            }else {
                System.out.println("Masukkan pilihan menu dengan benar.");
                return;
            }


            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon" + total_bayar);

        }
        else if (member.equals("n")) {
            if (pilihan_menu == 1){
                harga = 14000;
                System.out.println("Harga Rice bowl :" + harga);
        
        } else if (pilihan_menu == 2) {
            harga = 3000;
            System.err.println("Harga Ice Tea :" + harga);

        } else if(pilihan_menu == 3) {
            harga = 15000;
            System.out.println("Harga bundling :" + harga);

        } else {
            System.out.println("Masukkan menu dengan benar.");
            return;
        } total_bayar = harga;
        System.out.println("Total bayar = " + total_bayar);
        }
        else {
            System.out.println("Member tidak valid.");
            total_bayar = 0;
        }
        System.out.println("----------------------------------");

        System.out.println("Masukkan angka pilihan cara membayar");
        System.out.println("1. QRIS");
        System.out.println("2. Selain QRIS");
        pembayaran = input12.nextInt();

        if (pembayaran == 1) {
            total = (total_bayar - 1000);
        } else {
            total = total_bayar;
        }
         System.out.println("Total pembayaran anda adalah = " + total);





    }
}
