import java.util.Scanner;
public class Example1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n%2==0 && n>1)
        {
            n=n/2;
            
            System.out.println(n);
        }
        else
        {
            n=n/2;
            System.out.println(-(n+1));
         
        }
        
    }
}
