import java.util.Scanner;
public class Limakbob {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int m=sc.nextInt();
        int n=sc.nextInt();
        
        for(int i=0; i<=10; i++ )
        {
            if(m>n)
            {
                System.out.println(i);
                break;
            }
            else
            {
              m=m*3;
              n=n*2;
            }
        }

    }
}
