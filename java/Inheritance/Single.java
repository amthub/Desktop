public class Single {
    public static void main(String args[])
    {
     Son obj = new Son();
     obj.getdata(10, 20);
     obj.disp();
    }
}
class Father
{
    int a, b;
    void getdata(int x, int y)
    {
     a = x;
     b = y;
    }
}
class Son extends Father
{
    int add()
    {
      int sum = a+ b;
      return sum;
    }
    void disp()
    {
        System.out.println("The value of sum is = " +add());
    }
}
