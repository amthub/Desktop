import java.util.Scanner;
public class Grass 
{
    public static void main(String args[])    
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t;i++)
        {
            int m,n,s,v,a;
            m=sc.nextInt();
            n=sc.nextInt();
            s=sc.nextInt();
            v=sc.nextInt();
            int sum=m+n+s+v;
            a=sum==0?0:sum==4?2:1;
            System.out.println(a);
        }
    }
}
