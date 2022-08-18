import java.util.Scanner;
public class Prime {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=n/2;
        System.out.println(m);
        if(n%2==0)
        {
            for(int i =0; i<m; i++)
            {
                System.out.println("2");
            }
        }
        else if (n%2!=0)
        {
           System.out.println("3");
           for(int i=0; i<m-1; i++)
           {
               System.out.println("2");
           }
        }
    }
}
