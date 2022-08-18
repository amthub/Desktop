import java.util.Scanner;
class Watermelon 
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int w = obj.nextInt();
        if(w%2==0 && w>3)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
