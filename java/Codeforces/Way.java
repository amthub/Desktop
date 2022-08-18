import java.util.Scanner;
public class Way {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=0; i<n; i++)
        {
            String s = sc.next();
            int m = s.length();
            if(m>10)
            {
            System.out.print(s.charAt(0));
            System.out.print((m-2));
            System.out.print(s.charAt(m-1));
            }
        }
    }
}
