import java.util.Scanner;


class Flagstone
{
  public static void main(String args[])
  {
      Scanner sc = new Scanner(System.in);
      int m, n, a;
      m = sc.nextInt();
      n = sc.nextInt();
      a = sc.nextInt();
      int tiles = (m*n)%(a*a);
      if(tiles==0)
      {
         int stone = (m*n)/(a*a);
         if(stone>1 && stone%2==0)
         {
             
             System.out.println(stone);
            }
            else if(stone>1 && stone%2!=0)
            {
                stone = stone + 1;
                System.out.println(stone);
            }
            else{
                System.out.println(stone);

            }
      }
      else if(tiles!=0)
      {
          int stone = (m*n)/(a*a) + 1;
          if(stone>1 && stone%2==0)
         {
             
             System.out.println(stone);
            }
            else if(stone>1 && stone%2!=0)
            {
                stone = stone + 1;
                System.out.println(stone);
            }
            else{
                System.out.println(stone);
            }
         
      }
  }
}
