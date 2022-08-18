import java.util.Scanner;
public class Hastag {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m,n;
        m=sc.nextInt();
        n=sc.nextInt();
        for(int i=1; i<=m; i++)
        {
            if(i%2==0 && i>1)
            {
                if(i%4==0)
            {
                for(int l=0; l<n; l++)
                {
                    if(l==0)
                    {
                        System.out.print("#");
                    }
                }
            }
            else
            {
            for(int j=1; j<=n; j++)
            {
                if(j==n)
                {
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
                
            }
        }
    }
        else if(i%2!=0 || i==1)
        {
                for(int k=0; k<n; k++)
                {
                  System.out.print("#");
              }
            }
            System.out.println();
        }

    }
}
