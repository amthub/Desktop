
import java.util.Scanner;
class LowbalanceException extends Exception
{
     public LowbalanceException()
     {
         super("insufficient amount");
     }
}
class Exceptiontest
{
    public void atm(int m)
    {
        int money = m;
        Scanner sc = new Scanner(System.in);
        System.out.println("withdrawn amount");
        int withdrawn = sc.nextInt();
        if(money<withdrawn)
        {
            try{
            throw new LowbalanceException();
            }
            catch(LowbalanceException e)
            {
                System.out.println("Insufficient amount");
            }
        }
        else{
            int remain = money - withdrawn;
            System.out.println("remain money "+remain);
        }
    }

}
class Userdefinedexception1
{
    public static void main(String args[])
    {
       Exceptiontest sc = new Exceptiontest();
       sc.atm(13456);

    }
}





