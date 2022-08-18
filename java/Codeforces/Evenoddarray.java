import java.util.Scanner;
public class Evenoddarray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x,y=0,f=0,g;
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
        arr[i] = sc.nextInt();
        }
        for(int i=2; i<n; i+=2)
        {
           x=arr[0]%2;
           if(arr[i]%2!=x)
           {
              System.out.println("n0");
              f=1;
              break;
           }
           g=arr[1]%2;
           if(i<n-1)
        {
           if(arr[i+1]%2!=g && i<n-1 )
           {
               System.out.println("n0");
               f=1;
               break;
            }}
        }
         if(f==0)  
         {
             System.out.println("yes");
         }
        
        
    }
}