import java.util.Scanner;
public class Beautifulyear {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int n  = obj.nextInt();
        
        
            int F=0;
            do{
                n++;
                String st = String.valueOf(n);
            if(st.charAt(0)!=st.charAt(1) && st.charAt(0)!=st.charAt(2) && st.charAt(0)!=st.charAt(3) && st.charAt(1)!=st.charAt(2) && st.charAt(1)!=st.charAt(3) && st.charAt(2)!=st.charAt(3))
            {
                F=1;
                System.out.println(st);
                
            }
            
            }while(F==0);
    }
}
