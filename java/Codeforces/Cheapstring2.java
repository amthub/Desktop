import java.util.*;
import java.io.*;
public class Cheapstring2 {
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int t=sc.nextInt();
       for(int i=0; i<t; i++)
       {
        int n,sum=0;
        String s = sc.next();
        n=sc.nextInt();
        String k = "";
        
        String C = "";
        char temp[] = s.toCharArray();
        Arrays.sort(temp);
        for(int j=0; j<s.length(); j++)
        {
            sum=sum+(temp[j]-96);
            if(sum>n)
            {
                break;
            }
            k+=temp[j];
        }
        char ment[] = k.toCharArray();
        char amit[] = s.toCharArray();
       for(int j=0; j<s.length(); j++)
       {
           for(int z=0; z<k.length(); z++)
           {
               if(amit[j]==ment[z])
               {
                   C+=ment[z];
                   ment[z]=0;

                   break;
               }
           }
       }
       System.out.println(C);
       }
    }
}
