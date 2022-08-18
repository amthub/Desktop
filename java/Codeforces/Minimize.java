import java.util.*;
import java.io.*;
public class Minimize {
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int t=sc.nextInt();
       int m;
       for(int i=0; i<t; t++)
       {
           m=sc.nextInt();
           int sum = (int) Math.pow(2,m);
           
            for(int j=1; j<=m; j++)
            {
                
               if(j<(m/2))
               {
                   sum+=(int) Math.pow(2,j);
               }
               else if(j<m && j>=(m/2))
               {
                   sum-=(int) Math.pow(2,j);
               }
            }
            
            System.out.println(sum);

       }
    }
}
