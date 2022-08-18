import java.util.*;
public class Cheapspring {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int z=0; z<t; z++)
        {
        String s = sc.next();
        int n = sc.nextInt();
        int a =s.length();
        int sum=0,b;
        String k = "";
        String y = "";
        for(int i=0; i<a; i++)
        {
            sum+=s.charAt(i);
        }
        b=sum-(96*a);
        int m=b-n;
        int l=b-n;
        char temp[] = s.toCharArray();
        Arrays.sort(temp);
        for(int j=a-1; j>=0; j--)
        {
        
        if((temp[j]<=(96 + m) && l>0) || j==0 )
        {
           l=(96+l)-temp[j];
           y+=temp[j];
        }
        else 
        {
               k+=temp[j];
        }
        }
        System.out.println(l);
        if(l>0)
        {
            System.out.println("no");
        }
        else if(l<=0)
        {
        System.out.println(k);
        }
    }
    }
}
