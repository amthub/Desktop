import java.util.Scanner;
class Threedoors1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,y,arr[];
        n=sc.next();
        arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.next();
        }
        y=arr[n-1]==0?5:arr[arr[n-1]-1]!=0?"yes":"no";
        System.out.println(y);
    }
}