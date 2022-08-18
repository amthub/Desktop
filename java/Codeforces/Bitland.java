import java.util.Scanner;
public class Bitland {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int n, X=0;
        n = obj.nextInt();
        String arr[] = new String[n];
        String c1 = "++X";
        String c2 = "X++";
        String c3 = "--X";
        String c4 = "X--";
        
        for(int j=0; j<n; j++)
        {
             arr[j] = obj.next();
        }
        for(int i=0; i<n; i++)
        {
              
              boolean a = (arr[i].equals(c1));
              boolean b = (arr[i].equals(c2));
              if(a==true){
                  X=X+1;
              }
              if(b==true){
                X=X+1;
            }
            boolean c = (arr[i].equals(c3));
            boolean d = (arr[i].equals(c4));
            if(c==true)
            {
                X=X-1;
            }
            if(d==true)
            {
                X=X-1;
            }
        }
        
        System.out.println(X);

    }
}
