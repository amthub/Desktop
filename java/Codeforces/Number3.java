import java.util.Scanner;
public class Number3 {
    public  static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0; j<t; j++)
        {
        int n = sc.nextInt();
        int m=0;
        for(int i=1; i<=n; i++)
        {
            m+=1;
            if(i%3==0 || i%10==3)
            {
                n+=1;
            }
        }
        System.out.println(m);
        }
    }
}
