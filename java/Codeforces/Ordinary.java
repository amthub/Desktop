import java.util.Scanner;
public class Ordinary
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0; i<t; i++)
        {
        int x = sc.nextInt();
        String s = Integer.toString(x);
        int n = s.length();
        String f = "";
        for(int j=0; j<n; j++)
        {
          f+="1";
        }
        System.out.println(f);
        int g = Integer.parseInt(f);
        int k = x/g;
        int l = 9*(n-1);
        System.out.println(k+l);
    }

    }
}