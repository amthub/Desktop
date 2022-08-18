import java.util.Scanner;
public class geekl {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m,n,b=0,i;
        m=sc.nextInt();
        n=sc.nextInt();
        int a=m>n?m:n;
        for( i=a; i>0; i--)
        {
           if(m%i==0 && n%i==0)
           {
              b=i; 
              break;
           }
        }
        int c = (m/b) + (n/b);
        System.out.println(c);
    }
}
