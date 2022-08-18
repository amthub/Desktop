import java.util.Scanner;
public class Divide {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = obj.nextInt();
        int m = obj.nextInt();
        int x = n/m;
        int y = n%m;
        System.out.println("Quotient = "+x);
        System.out.println("Remainder = "+y);
    }
}
