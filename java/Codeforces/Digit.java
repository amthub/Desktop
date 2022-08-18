import java.util.Scanner;
class Digit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
         a=sc.nextInt();
         b=sc.nextInt();
         c=sc.nextInt();
         d=sc.nextInt();
         int sum=0;
         int e = (a>c)?c:a;
         int f = (e>d)?d:e;
         sum = sum + (256*f);
         int g = (b>(a-f))?(a-b):b;
         sum = sum + (32*g);
         System.out.println(sum);
    }
}