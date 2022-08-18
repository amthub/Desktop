
import java.util.Scanner;
public class Userinput {
    public  static void main(String args[])
    {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the value of row");
    int m = obj.nextInt();
    System.out.println("Enter the value of row");
    int n = obj.nextInt();
    int num[][] = new int[m][n];

    System.out.println("Enter the value of elements");
    for(int i=0; i<num.length; i++)
    {
        for(int j=0; j<num[i].length; j++)
        {
            num[i][j] = obj.nextInt();
        }
    }
    System.out.println("You entered");
    for(int i=0; i<m; i++)
    {
        for(int j=0; j<n; j++)
        {
            System.out.print( +num[i][j]+ " ");
        }
        System.out.println();
    }
    }
}
