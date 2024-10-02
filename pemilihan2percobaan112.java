import java.util.Scanner;
public class pemilihan2percobaan112 {

    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        System.out.println("Typekan tahun sembarang lah walawee :");
        int tahun = input12.nextInt();
        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun kabisat");
            }
            else {
                System.out.println("Bukan tahun kabisat");
            }
        }
        else 
     {
        System.out.println("Bukan tahun kabisat");
     }
    }
}