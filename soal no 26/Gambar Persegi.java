import java.util.Scanner;
class GambarPersegi {
  public static void main(String[] args) {
   Scanner input = new Scanner (System.in);

int baris,b ;

System.out.print("");
baris = input.nextInt();

for (b=1 ; b<=baris ; b++) {
System.out.print("*");
}
System.out.println();
  }
}
