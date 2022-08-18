import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class Mishika
{
    public static void main(String argm[])
    {
       Scanner sc = new Scanner(System.in);
       int round = sc.nextInt();
       int mishika=0,chrish;
       int arr1[] = new int[round];
       int arr2[] = new int[round];
       for(int i=0; i<round; i++)
       {
          arr1[i]=sc.nextInt();
          arr2[i]=sc.nextInt();
       }
       for(int i=0; i<round; i++)
       {
           mishika = arr1[i]>arr2[i]?(mishika+1):mishika;
           mishika = (arr1[i]<arr2[i]?(mishika-1):(mishika));
       }
       if(mishika>0)
       {
           System.out.println("mishika");
       }
       else if(mishika==0)
       {
           System.out.println("friends");
       }
       else if(mishika<0)
       {
        System.out.println("chrish");
       }
       System.out.println(mishika);
    }
}