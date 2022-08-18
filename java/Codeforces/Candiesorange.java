
import java.util.*;
public class Candiesorange
{
    public static void main(String args[])
    
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0; k<t; k++)
        {
        int n=sc.nextInt();
        long sum=0,d,e,y;
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            arr2[i]=sc.nextInt();
        }
    
        int a[] = arr1.clone();
        int b[] = arr2.clone();
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0; i<n; i++)
        {
            
           
            d=arr1[i]-a[0];
            
            e=arr2[i]-b[0];
            y=d>e?d:e;
            sum+=y;
        }
        System.out.println(sum);
    }}
}
        
        
       
       
