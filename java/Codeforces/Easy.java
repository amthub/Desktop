import java.util.Scanner;
public class Easy {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, f=0;
        n= sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i =0; i<n; i++)
        {
            if(arr[i]==1)
            {
                f=1;
                break;
                
            }
            
        }
        if(f==1)
        {
            System.out.println("hard");
        }
        else{
            System.out.println("easy");
        }
    }
}
