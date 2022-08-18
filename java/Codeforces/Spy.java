import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class Spy
{
    public static void main(String argf[])
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0; k<t; k++)
        {
        int n = sc.nextInt();
        int sum,S;
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        if(n==3)
        {
            if(arr[0]!=arr[1] && arr[0]!=arr[2])
            {
                System.out.println("1");
            }
            else if(arr[1]!=arr[0])
            {
                System.out.println("2");
            }
            else if (arr[2]!=arr[0])
            System.out.println("3");
        }
        else
        {
        for(int j=0; j<n; j++)
        {
            sum=0;
        for(int i=(j+1); i<(j+3)&&i<n; i++)
        {
           if(arr[j]!=arr[i])
           {
               sum+=1;
               if(sum==2)
               {
                   S=j+1;
                   System.out.println(S);
                   break;
               }
           }
        }
    }
        if(arr[n-2]!=arr[0] && arr[n-2]!=arr[1])
        {
        System.out.println(n-1);
        }
        else if(arr[n-1]!=arr[0] && arr[n-1]!=arr[1])
        System.out.println(n);
    }
    }
    }
}
