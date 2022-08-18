import java.util.Scanner;
public class Parkway {
    public static void main(String args[])
    
    {
        Scanner sc = new Scanner(System.in);
        int n, m ;
        int t =sc.nextInt();
        for(int i=0; i<t; i++)
        {
        n= sc.nextInt();
        m = sc.nextInt();
        int sum=0;
        int arr[] = new int[n];
        for(int j =0; j<n; j++)
        {
            arr[j]=sc.nextInt();
            sum = sum + arr[j];
        }
        if(sum>m)
        {
            sum = sum-m;
            System.out.println(sum);
        }
        else{
            System.out.println(0);
        }
    }
    }
}
