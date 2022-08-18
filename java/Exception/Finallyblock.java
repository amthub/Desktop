import java.util.Scanner;

class Finallyblock
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
        System.out.println("Value of c = "+c);
        System.out.println("Division successful");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divional is not possible");

        }
        finally{
            System.out.println("finally block");
        }
        System.out.println("Programm end");
    }
}
