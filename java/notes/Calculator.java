import java.util.Scanner;

public class Calculator
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("1 for addition");
        System.out.println("2 for subtraction");
        System.out.println("3 for multiply");
        System.out.println("4 for division");
        System.out.println("5 for Exit");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        switch(choice)
        {
          case 1 :
          int sum = a + b;
          System.out.println("the value of sum is = "+sum);
          break;

          case 2:
          int subtraction = a - b;
          System.out.println("the value of subtraction is = "+subtraction);
          break;
          
          case 3:
          int multiply = a*b;
          System.out.println("the value of multiply is = "+multiply);
          break;

          case 4 :
          int division = a/b;
          System.out.println("the value of division is = "+division);
          break;
          
          case 5:
          System.exit(0);

          default:
          System.out.println("invalid operation");
        }  
      }
    }
}
