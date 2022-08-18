class Singleinheritance
{
    public static void main(String args[])
    {
        Son sc = new Son();
        sc.getdata(10, 20);
        sc.disp();
    }   
}

class Father
{
    int a, b;
    void getdata(int x, int y)
    {
     a =x;
     b = y;
    }
}

class Son extends Father
{
    int add()
    {
    int Sum = a + b;
    return Sum ;
    }

    void disp()
    
    {
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("sum = "+add());
        
    }
}