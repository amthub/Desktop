import java.util.Scanner;
public class Classbit {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, sum=4;
        n = sc.nextInt();
        String c1 = "++X";
        String c2 = "X++";
        String c3 = "--X";
        String c4 = "X--";
        String arr[] = new String[n];
        for(int i=0; i<n; i++)
        {
         arr[i] = sc.next();
        }
        for(int i=0; i<n; i++)
        {
           if(arr[i]== "x"||arr[i]==c2)
           {
           sum=sum+1;
           }
           
        }
    
        System.out.println(sum);
    }
}
