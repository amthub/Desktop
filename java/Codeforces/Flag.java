
import java.util.Scanner;
 class Flag 
 {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      double m, n, a;
      m = sc.nextFloat();
      n = sc.nextFloat();
      a = sc.nextFloat();
      double fs = 0.0;
      double c = Math.pow(10,9);
      int f =(1<=n&&1<=m&&1<=a&&n<=c&&a<=c)?1:0;
      if(f==1)
      {
          if((m*n)>(a*a))
          {
              double M=(m%a==0)?m:(m+(m%a));
              double N=(n%a==0)?n:(n+(a-(n%a)));
              fs=((M*N)/(a*a));
          }
                  else if((m*n)<=(a*a));
              {
                fs=1.0;
              }
          int stone=(int)fs;
          System.out.println(stone);
      }
    }
}
