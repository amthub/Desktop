import java.util.Scanner;
public class Bananas {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int k,n,w,sum=0,x,Y;
        k = sc.nextInt();
        n = sc.nextInt();
        w = sc.nextInt();
        for(int i=1; i<=w; i++)
        {
            Y=k*i;
            sum+=Y;
        }
        if(sum>=n)
        {
            x=sum-n;
        System.out.println(x);
        }
        else{
            System.out.println(0);
        }
    }
}
