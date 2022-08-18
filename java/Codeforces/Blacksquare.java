import java.util.Scanner;
public class Blacksquare {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        String a = sc.nextLine();
        System.out.println(a);
        String s = sc.next();
       
        System.out.println(s);
        char temp[] = s.toCharArray();
        for(int i=0; i<s.length(); i++)
        {
            sum+=temp[i];
            System.out.println(sum);
            System.out.println(temp[i]);
        }
        System.out.println(sum);
    }
}
