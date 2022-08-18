
  class Example
  {
      int a, b, total;
      void add()
      {
          total = a + b;
      }
  }

  class Submission
  {
      public static void main (String args[])
      {
          Example obj = new Example();
          obj.a = 23;
          obj.b = 29;
          obj.add();
          System.out.println("Sum = " +obj.total);
      }
  }
