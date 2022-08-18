import java.util.Scanner;
class Palnaroma
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int sum=0;
        for(int i = 65; i<=90; i++)
        {
            for(int j=0; j<n; j++)
            {
              if(s.charAt(j)==i || s.charAt(j)==(i+32)) 
              {
                  sum=sum+1;
                  break;
              }
            }
        }
        if(sum>25)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}