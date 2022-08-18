import java.util.Scanner;
import java.io.*;
public class power 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of number");
        int number = sc.nextInt();
        System.out.println("Enter the value of power");
        int power = sc.nextInt();
         System.out.println(Math.pow(number,power));
        
    }
}
