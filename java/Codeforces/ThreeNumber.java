import java.util.Scanner;
class ThreeNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int f=0,g=0,h=0;
        String n="123";
        String t="";
        for(int i=0; i<s.length(); i+=2)
        {
            if(s.charAt(i)==n.charAt(0))
            {
              f+=1;
            }
            if(s.charAt(i)==n.charAt(1))
            {
              g+=1;
            }
            if(s.charAt(i)==n.charAt(2))
            {
              h+=1;
            }
        }
        for(int i=0; i<(s.length()/2)+1; i++)
        {
            if(i<f)
            {
                t+="1";
                t+="+";
            }
            if(f<=i && i<(g+f))
           {
              t+="2";
              t+="+";
           }
           if((g+f)<=i && i<(g+f+h-1))
           {
               t+="3";
               t+="+";
            }
            if( (g+f+h-2)<i)
            {
               t+="3";
            }
        }
        System.out.println(t);
       

    }
}