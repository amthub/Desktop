import java.util.Scanner;
public class Petya {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int x,y,z,ch1,ch2;
        String s = sc.nextLine();
        String t=sc.nextLine();
        String str2=s.toUpperCase();
        String str1=t.toUpperCase();
        boolean a = (str1.equals(str2));
        if(a==true)
        {
        System.out.println("0");
        }
        else 
        {
            for(int i=0; i<s.length(); i++)
            {
                if(str1.charAt(i)!=str2.charAt(i))
                {
                    x=str1.charAt(i);
                    y=str2.charAt(i);
                    break;
                }
            }
            for(int i=65; i<91; i++)
            {
                if(x==i)
                {
                    ch1=i;
                }
                if(str1.==i)
                {
                    ch2=i;
                }
            }
            z=x-y;
            if(z>1)
            {
                System.out.println("1");
            }
            else{
                System.out.println("-1");
            }
        }
                
            
        
    }
}
