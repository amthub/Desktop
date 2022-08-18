import java.util.Scanner;
public class Polive {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int hired=0,crime,untreated=0,process;
        for(int i=0; i<m; i++)
        {
            crime=0;
            process=sc.nextInt();
            if(process>0)
            {
               hired+=process;
            }
            if(process==-1)
            {
                crime=hired-1;
                if(hired>0)
                {
                hired-=1;
                }
                if(crime<0)
                {
                    untreated+=1;
                }
            }
        }
        System.out.println(untreated);
    }
}
