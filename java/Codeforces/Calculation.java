import java.util.Scanner;
public class Calculation {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0, sign;
        for(int i=1; i<=n; i++)
        {
            sign = -1;
            if(i%2==0)
            {
                sign= 1;
            }
           
            sum = sum + (sign*i);
        }
        System.out.println(sum);
    }
}
