import java.util.Scanner;
class ArrayTerbalik {
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
    int i;
    int []data=new int [5];
    for(i=0; i<5;i++)
    {
      System.out.print("");
      data[i]=in.nextInt();
    }
      
      System.out.print("");
      System.out.print("\n    \t");
      for(i=4; i>=0; i--)
    {
      System.out.println(" "+data[i]);
    }
}}
