import java.util.Scanner;
public class Beautiful {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x,f=0,g=0,y,z;
        
        
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<5; j++)
            {
              x=sc.nextInt();
              if(x==1)
              {
                  f=i;
                  g=j;
              }
            }
        }
        y = (Math.abs(3-f));
        z = (Math.abs(3-g));
       System.out.println(y+z);
    }
}
