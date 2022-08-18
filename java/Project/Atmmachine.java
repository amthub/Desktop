import java.util.Scanner;
class Atmmachine
{
    public static void main(String args[])
    {
        int withdrawn, deposit, balance = 12000;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
        System.out.println("ATM Machine");
        System.out.println("Enter the 1 for account balance");
        System.out.println("Enter the 2 for deposite money");
        System.out.println("Enter the 3 for withdraw money");
        System.out.println("Enter the 4 for exit");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1 :
            System.out.println("Balance in your account is = "+balance);
            System.out.println("");
            break;
            case 2 :
            System.out.println("enter the amount you want to deposite");
            deposit = sc.nextInt();
            balance = balance + deposit;
            System.out.println("your amount successfully deposited");
            System.out.println("");
            break;
            case 3 :
            System.out.println("Enter the amount you want to withdrawn");
            withdrawn = sc.nextInt();
            if(balance>=withdrawn)
            {
                balance = balance - withdrawn;
                System.out.println("Please collect your money");
                
            }
            else
            {
                System.out.println("Insufficient amount");
                
            }
            System.out.println("");
            break;
            case 4 :
            System.exit(0);
            }
        }
    }
}