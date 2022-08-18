import java.util.Scanner;
public class Hate {
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
           if(i==n && i%2==0 && i>1)
           {
              System.out.print("I love it");
           }
           else if(i==n && i%2!=0 || n==1)
           {
               System.out.print("I hate it");
           }
           else if(i%2==0)
           {
               System.out.print("I love that");
           }
           else if(i%2!=0)
           {
               System.out.print("I hate that");
           }
           System.out.print(" ");
        }
    }
}
