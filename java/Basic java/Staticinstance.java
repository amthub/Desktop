public class Staticinstance {
    public static void main(String args[])
    {
    Test1 obj = new Test1();
 obj.disp();
    }
}
class Test
{
    static int add ()
    {
        int a = 10, b = 12;
        int z = a + b;
        return z;
    }
}
class Test1
{
    void disp()
    {
 int x = Test.add();
 System.out.println(x);
    }
}