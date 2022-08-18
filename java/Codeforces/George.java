import java.util.Scanner;
class George
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m,n=0;
         m = sc.nextInt();
         
        int arr1[] = new int[m];
        int arr2[] = new int[m];
        for(int i=0; i<m; i++)
        {
            arr1[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
        }
        for(int i =0; i<m; i++)
        {
            if(arr1[i]!=arr2[i] && (arr2[i]-arr1[i]>1))
            {
               n++;
            }
            
        }
        System.out.println(n);
    }
}