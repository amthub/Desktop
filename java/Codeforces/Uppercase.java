import java.util.Scanner;
class Uppercase
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = str.substring(1);
        String s1 = str.substring(1,1);
        String s2 = s1.toUpperCase();
        String s3 = s2+s;

        System.out.println(str.substring(1));
    }
}