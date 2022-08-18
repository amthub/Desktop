import java.util.Scanner;
public class Reverse {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int n=s.length();
        int f=0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)==t.charAt(n-(i+1)))
            {
               f+=1;
            }
        }
        if(f==n)
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
