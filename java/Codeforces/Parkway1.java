import java.util.Scanner;
public class Parkway1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0; i<t; i++)
        {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum=0;
        for(int j=0; j<n; j++)
        {
            int a=sc.nextInt();
            sum = sum +a;
        }
        
        int e = sum - m;
        if(e<0)
        {
            e=0;
        }
        System.out.println(e);
    }
    }
}
