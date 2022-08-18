import java.util.Scanner;
public class Competeion {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int j=0; j<x; j++)
        {
        
        long n=sc.nextLong();
        long m=sc.nextLong();
        long sum=0;
        
        for(long i=1; i<m; i++)
        {
          sum = sum + i;
        }
        for(long i=m; i<=(m*n); i+=m)
        {
          sum = sum + i;
        }
        System.out.println(sum);
        }
    }
}
