import java.util.Scanner;
class Saima {
    public static void main(String argd[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int m,saima=0,daijo=0,b;
        int k=0,j=n-1;
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        for( int i=1; i<=n; i++ )
        {
            m=arr[k]>arr[j]?arr[k]:arr[j];
            b=arr[k]>arr[j]?(k=k+1):(j=j-1);
            if(i%2==0 && i>1)
            {
                saima+=m;
            }
            else if(i%2!=0 || i==1)
            {
               daijo+=m;
            }
        }
        System.out.println(daijo);
        System.out.println(saima);
    }
}
