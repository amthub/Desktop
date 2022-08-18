import java.util.Scanner;
public class Number {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int k, m;
        k = sc.nextInt();
        m=sc.nextInt();
        for(int i=m; i>=1; i--)
        {
          if(k%10==0)
          {
              k=k/10;
          }
          else
          k=k-1;
        }
        System.out.println(k);
    }
}
