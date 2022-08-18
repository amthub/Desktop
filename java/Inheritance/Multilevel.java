public class Multilevel {
    public static void main(String args[])
    {
     Grandson sc = new Grandson();
     sc.getdata(10, 20);
     sc.disp();
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
    int c = 30;
    int add()
    {
     int Sum = a+b+c;
     return Sum;
    }
}
class Grandson extends Son
{
    void disp()
    {
        System.out.println("sum = " +add());
    }
}
