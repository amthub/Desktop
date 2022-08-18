import java.util.*;
public class Lovea
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n=s.length();
        char temp[] = s.toCharArray();
        Arrays.sort(temp);
        String str = new String(temp);
        System.out.println(str);
        int m=str.lastIndexOf('a')+1;
        int y=(n/2)+1<m?n:2*m-1;
        System.out.println(y);
    }
}