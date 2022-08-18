
import java.util.Scanner;
class Userinput
{
    public static void main(String args[])
    {
        int a;
        float b;
        String c;
        
        Scanner obj = new Scanner(System.in);
        
        c = obj.nextLine();
        a = obj.nextInt();
        b = obj.nextFloat();

        System.out.println(" String =" +c);
        System.out.println(" Integer =" +a);
        System.out.println(" Float = " +c);

        



    }
}
