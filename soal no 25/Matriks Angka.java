import java.util.Scanner;
class MatriksAngka {
  public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
 System.out.print("");
        int baris = input.nextInt();
             for (int i = 0; i < baris; i++) {
            for (int j = 0; j < baris; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
}}
  
