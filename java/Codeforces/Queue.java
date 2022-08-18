import java.util.Scanner;
public class Queue {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int t=sc.nextInt();
        char temp;
        int k;
        String str = sc.next();
        char arr[] = str.toCharArray();
        for(int l=0; l<t; l++)
        {
        for(int j=0; j<arr.length;)
        {
            k=j+1;
            if(k<arr.length)
            {
                if(arr[j]=='B' && arr[k]=='G')
                {
                    temp=arr[j];
                    arr[j]=arr[k];
                    arr[k]=temp;
                    j++;
                }
            }
            j++;
        }
        }
        
        System.out.print(arr);
        

    }
}
