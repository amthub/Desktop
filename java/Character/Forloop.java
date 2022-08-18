import java.util.Scanner;
public class Forloop 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char a[] = new char[5];
       
        System.out.println("Enter the value of characters");
        for(int i=0; i<5; i++)
        {
             a [i] = sc.next().charAt(0);
        }
        System.out.println(" the value of characters");
        for(int i=0; i<5; i++)
        {
             System.out.println("a [" +i+"] = " +a[i]);
        }
    }
}
