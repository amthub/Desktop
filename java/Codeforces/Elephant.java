import java.util.Scanner;
public class Elephant {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int divide = m/5;
        if(m%5==0)
        {
            System.out.println(divide);
        }
        else{
            divide = divide+1;
            System.out.println(divide);
        }

    }
}
