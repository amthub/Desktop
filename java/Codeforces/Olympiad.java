import java.util.Scanner;
public class Olympiad {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,f=0,g=0,h=0,a,b,k,l,m;
         n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=1; i<=n; i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i]==1)
            {
                f+=1;
                k=i;
            }
            else if(arr[i]==2)
            {
                g+=1;
                l=i;
            }
            else if(arr[i]==3)
            {
                h+=1;
                m=i;
            }
            
        }
        a=(g<h)?g:h;
        b=(a<f)?a:f;
        System.out.println(b);
        for(int i=0;i<b; i++)
        {
           int arr1[] = new int[3];
           for(int j=0; j<3; j++)
           {
               arr1[j] = 
           }
        }
    }
}
