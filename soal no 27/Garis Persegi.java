import java.util.Scanner;
class GarisPersegi {
  public static void main(String[] args) {
    Scanner masukan=new Scanner(System.in);
      System.out.print("");
        int input = masukan.nextInt();
     
        {
            for (int i=1; i <= input ; i++)
            {
                if (i != 1 && i != input)
                {
                     for (int j=1; j <= input ; j++)
                    {
        if (j>1 && j<input)
                        {
                            System.out.print("  ");
                        }
                            else
                            {
                                System.out.print(" #");
                            }
                    }
                }
                else
                {
                    for (int x=1; x <= input ; x++)
                    {
                        System.out.print(" #");
                    }
                }
                System.out.print("\n");
            }
        }
  }
}
