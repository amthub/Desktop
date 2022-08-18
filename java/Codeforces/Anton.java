import java.util.Scanner;


public class Anton {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int sum=0, sub=0;
        String s = sc.nextLine();
        String a = sc.nextLine();
        
        for(int i=0; i<s.length(); i++)
        {
         if(a.charAt(i)=='A')
         {
           sum = sum + 1;;
         }
         else
         {
           sub = sub + 1;;
         }
        }
        if(sum>sub)
        {
          System.out.println("Anton");
        }
        else if(sub>sum)
        {
          System.out.println("Danik");
        }
        else if (sum==sub)
        {
          System.out.println("Friendship");
        }
    }
}
