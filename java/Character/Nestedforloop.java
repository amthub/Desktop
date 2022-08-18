import java.util.Scanner;
 public class Nestedforloop
{
    public static void main(String args[])
    {
      Scanner obj = new Scanner(System.in);
      char a[][] = new char[3][2];
      System.out.println("Enter the value of character");
      for(int i=0; i<3; i++)
      {
          for(int j=0; j<2; j++)
          {
              a[i][j] = obj.next().charAt(0);
          }
      }
      System.out.println(" the value of character");
      for(int i=0; i<3; i++)
      {
          for(int j=0; j<2; j++)
          {
              System.out.print(a[i][j]+ " ");
          }
          System.out.println("");
      }
    }
}

