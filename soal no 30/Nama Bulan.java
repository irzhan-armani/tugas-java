import java.util.Scanner;

public class NamaBulan {
    public static void main(String[] args) {

        String[] Bulan = {
                "Januari",
                "Februari",
                "Maret",
                "April",
                "Mei",
                "Juni",
                "Juli",
                "Agustus",
                "September",
                "Oktober",
                "November",
                "Desember",
        };
        Scanner n = new Scanner(System.in);
        int angka = n.nextInt();
        int jan = 0;
        if ( angka >0 && angka <=12){
          System.out.println(Bulan[angka-1]);
        } else {
          System.out.println("Nomor tidak valid");
    }
  }
}
