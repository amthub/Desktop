import java.util.Scanner;
public class Amit {
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       int n=s.length();
       int sum=0;
       System.out.println(n);

       for(int i=97; i<123; i++)
       {
           
           for(int j=1;  j<n; j+=3)
           {
              if(s.charAt(j)==i)
              {
                  sum+=1;
                  break;

              }
           }
       }
      
      System.out.println(sum);

    }
}

