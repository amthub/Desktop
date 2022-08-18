import java.util.Scanner;
public class Nextround 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, k, num = 0;
        System.out.println("Enter the value of n");
        System.out.println("Enter the value of k");
        n= sc.nextInt();
        k = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("The scores are");
        for(int i=0; i<n; i++)
        {
             arr[i] = sc.nextInt();
        }
        for(int i =0; i<n; i++)
        {
            if(arr[i]>=k && arr[i]>0)
            {
                num++;
            }
        }
        System.out.println("output = "+num);
    }
}
