import java.util.Scanner;
public class Ssdasht {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int flag=0,y;
        String s=sc.next();
        String str1 = "";
        String str2 = "";
        for(int i=0; i<s.length(); i++)
        {
            str1+=s.charAt(i);
            if(s.charAt(i)!='a')
            {
              str2+=s.charAt(i);
            }
            if((str1+str2).equals(s))
            {
                flag=1;
                break;
            }
        }
       if(flag==1)
       {
        System.out.println(str1);
       }
        else 
        {
        System.out.println(":(");
        }
    }
}
