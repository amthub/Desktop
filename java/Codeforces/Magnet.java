import java.util.Scanner;
public class Magnet {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int f=1;
        for(int i =0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=1; i<n; i++)
        {
            if(arr[i]!=arr[(i-1)])
            {
             f+=1;
            }
        }
        System.out.println(f);
    }
}
