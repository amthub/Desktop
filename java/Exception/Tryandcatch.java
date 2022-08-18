import java.util.Scanner;
public class Tryandcatch 
{
   public static void main(String args[]) 
   {
       try
       {     
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of a");
       int a = sc.nextInt();
       System.out.println("Enter the value of b");
       int b = sc.nextInt();
       int c = a/b;
       System.out.println("Division = "+c);
       System.out.println("Programm succesful");
       }
       catch(ArithmeticException e)
       {
           System.out.println("this is invalid");
       }
   }
}
