import java.util.Scanner;

class GanjilGenap {
  public static void main(String[] args) {
    int a;
    Scanner scan = new Scanner(System.in);
    System.out.print("");
    a = scan.nextInt();
    if (a % 2 == 0) {
      System.out.print("Genap");
    } else {
      System.out.print("Ganjil");
    }
  }
}
