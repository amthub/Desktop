import java.util.Random;
import java.util.Scanner;
public class Numberguessinggama {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int choose=0;
        int highscore=0;
        while(choose==0)
        {
            Random random = new Random();
            int x = random.nextInt(100);
            int score=0,n;
            System.out.println("enter the number");
        do
        {
            n=sc.nextInt();
            if(n<x)
            System.out.println("please choose greater number");
            else if(n>x)
            System.out.println("please choose smaller number");
            else if(n==x)
            System.out.println("Hurray! you win");
            score+=1;
            
        }while(n!=x);
            System.out.println("your score = "+score);
            highscore=highscore>score?highscore:score;
            System.out.println("high score = "+highscore);
            System.out.println("enter 1 to go back");
            System.out.println("enter 0 to start the new game");
            choose = sc.nextInt();
    }
    }
}
