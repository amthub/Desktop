import java.util.Scanner;
public class Newyear
 {
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int m=sc.nextInt();
       int n=sc.nextInt();
       n=240-n;
       int y,sum=0;
       for(int i=1; i<=m; i++)
       {
          y=i*5;
          sum+=y;
          if(sum>n)
          {
              System.out.println(i-1);
              break;
       }
    }
}
}
