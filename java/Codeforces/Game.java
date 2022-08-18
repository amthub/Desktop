import java.util.Scanner;
public class Game 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int  n,p;
        
        n=sc.nextInt();
        int arr1[] = new int[n];
        for (int i=0; i<n; i++)
        {
          arr1[i] = sc.nextInt();
        }
        p = sc.nextInt();
        int arr2[] = new int[p];
        for(int i =0; i<p; i++)
        {
           arr2[i] = sc.nextInt();
        }
        int arr3[] = new int[n+p];
        for(int z=0; z<(n+p);)
        {
          for(int j=0; j<n; j++)
          {
            arr3[z] = arr1[j];
            z++;
          }
          for(int k=0; k<p; k++)
          {
            arr3[z] = arr2[k];
            z++;
          }
        }
          for(int x=0; x<(n+p); x++)
          {
            System.out.print(+arr3[x]);
          }
    }
}
