import java.util.Scanner;
public class Additionarray {
    public static void main(String args[])
    {
      Scanner obj = new Scanner(System.in);
      System.out.println("Enter the no of values");
      int n = obj.nextInt();
        int total = 0;
        int num[] = new int[3];
        
        for(int i : num)
        {
          total = total + i;
          System.out.println(i);
        }
        System.out.println("total = " +total);
    }

}
