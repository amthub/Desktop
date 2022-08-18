import java.util.Scanner;
public class Userdefinedexception {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int money = 5000;
      System.out.println("Enter the amount of money you want to withdrawn from your account");
      int withdrawn = sc.nextInt();
      int balance = money - withdrawn;
      System.out.println("The balance money in account is "+balance);
    }
}
