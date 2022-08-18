import java.util.Scanner;
public class Dragon 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,m,k,l,p,y=0;
        n=sc.nextInt();
        m=sc.nextInt();
        k=sc.nextInt();
        l=sc.nextInt();
        p=sc.nextInt();
        for(int i=1; i<=p; i++)
        {
        if(i%n==0 || i%m==0 || i%k==0 || i%l==0)
        {
            y+=1;
        }
        }
        System.out.println(y);
    }
}
