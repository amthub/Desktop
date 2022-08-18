import java.util.Scanner;
class pedestals
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0; i<t; i++)
        {
        int n = sc.nextInt();
        int m=n/3;
        int a = n%3==0?m+1:m+2;
        int s = (a-1)==(n-a)?a-2:a-1;
        int v=n-(a+s);
        System.out.println(s);
        System.out.println(a);
        System.out.println(v);
        }
    }
}