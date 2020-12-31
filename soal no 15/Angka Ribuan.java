import java.util.Scanner;
import java.util.Locale;

public class main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    Locale bahasa = new Locale("id");

    int harga = in.nextInt();
    System.out.print("Rp");
    System.out.printf(bahasa, "%,d,-\n", harga);

  }
}
