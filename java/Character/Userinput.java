import java.util.Scanner;
public class Userinput {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of character");
        char a = sc.next().charAt(0);
        System.out.println(" the value of character a = "+a);
    }
}
