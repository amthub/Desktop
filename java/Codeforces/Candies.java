import java.util.Scanner;
class Candies
{
    public static void main(String argf[])
    {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        for(int i=0; i<f; i++)
        {
            int m = sc.nextInt();
            int n = m/2;
            n=n+1;
            System.out.println(m-n);

        }
    }
}