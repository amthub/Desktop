
import java.util.Scanner;
public class Userinput 
{
    public static void main (String args[])
    {
      Scanner obj = new Scanner(System.in);
     
      int num[] = new int[3];
      System.out.println("Enter the value");
      for(int i = 0; i<3; i++)
      {
       num[i] = obj.nextInt();

      }
      System.out.println("You entered ");
      for(int i=0; i<3; i++)
      {
          System.out.println(num[i]);
      }
    }
}
