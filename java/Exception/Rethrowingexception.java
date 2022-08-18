public class Rethrowingexception 
{
    public static void main(String args[])
    {
       try{
           getdata();
           getdata1();
          }
          catch(NullPointerException e)
          {
              System.out.println("Exception handled");
          }
    }

       static void getdata()
       {
        try{
      int a = 100/2;
      System.out.println(a);
   }
   catch(ArithmeticException e)
   {
     throw new  NullPointerException();
   }
     }
    static void getdata1()
    {
        try{
      int b = 100/0;
      System.out.println(b);
        }
        catch(ArithmeticException e)
        {
            throw new NullPointerException();
        }
    }
}