import java.util.Scanner;
public class Three 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f, sum=0;
        for(int j=0; j<n; j++)
        {
            f=0;
        for(int i=0; i<3; i++)
        {
            int m = sc.nextInt();
            if(m==1)
            {
                f=f+1;
            }
        }
        if(f>=2)
        {
            sum=sum+1;
        }
    }
        System.out.println(sum);
    }
}
