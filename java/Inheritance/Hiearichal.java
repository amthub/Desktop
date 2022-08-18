public class Hiearichal {
    public static void main(String args[])
    {
     Daughter sc = new Daughter();
     sc.getdata(10, 20);
     sc.disp();
     Son ss = new Son();
     ss.getdata(29, 23);
     ss.disp();
    }
}
class Father
{
    int x, y;
 void getdata(int a, int b)
 {
  x = a;
  y = b;
 }
}
class Son extends Father
{
    int add()
    {
    return (x+y);
    }
    void disp()
    {
        System.out.println("Sum = " +add());
    }
}
class Daughter extends Father
{
    int abcd()
    {
        return (x*y);
    }
    void disp()
    {
        System.out.println("multiply = " +abcd());
    }
}
    
    
