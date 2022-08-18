import java.util.Scanner;
public class Multiplication 
{
    public static void main(String args[])
    {
    
     Scanner sc = new Scanner(System.in);
     int a, b, c;
     float d, e;
     float multiplication;
     System.out.println("Enter the value of a, b, c, d, e");
     a =sc.nextInt();
     b =sc.nextInt();
     c =sc.nextInt();
     d =sc.nextFloat();
     e =sc.nextFloat();
     
     multiplication = a*b*c*d*e;
     System.out.println("the product is = "+multiplication);
     
    }
}
