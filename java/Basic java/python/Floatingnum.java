import java.util.Scanner;
public class Floatingnum {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        float n =sc.nextFloat();
        System.out.println("Enter the max power");
        int x = sc.nextInt();
        for(int i = 1; i<=x; i++)
        {
            System.out.println(Math.pow(n,i));
        }
    }
}
