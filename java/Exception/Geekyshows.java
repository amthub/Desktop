public class Geekyshows 
{
    public static void main(String args[])
    {
      Geekyshows sc = new Geekyshows();
      try
      {
          sc.fetdata();
      }
      catch(ArithmeticException e)
      {
          System.out.println("not possible");
      }
    }

      void fetdata()
    {
     System.out.println("Hello fetdata");
     fetdata1();
    }
    void fetdata1()
    {
    System.out.println("hello fetdata1");
    int a = 100/0;
    System.out.println("Division successfull"+a);
    }
}