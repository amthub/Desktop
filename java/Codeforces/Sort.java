import java.util.*;
public class Sort {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s,s1,s2,sm;
        int cn=0;
        s1=sc.next();
        s2=sc.next();
        sm=sc.next();
        s=s1+s2;
        char[] arr = s.toCharArray();
        char[] arr1 = sm.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        System.out.println(arr);
        System.out.println(arr1);
        if(Arrays.equals(arr,arr1))
        {
            System.out.println("yes");
        }
        else 
        System.out.println("no");
    }
}
