import java.util.Scanner;
public class Twointeger {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0; i<t; i++)
        {
            int k,a,m,x,sum=0;
             k = sc.nextInt();
             a = sc.nextInt();
             m = Math.abs(k-a);
            
               for(int j=10; j>0; j--)
               {
                   
                   if(m>=j)
                   {
                    x=m/j;
                    sum+=x;
                    m=m%j;
                   }
               }
               System.out.println(sum);
            
        }
    }
}
