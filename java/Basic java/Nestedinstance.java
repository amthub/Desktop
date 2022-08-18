public class Nestedinstance {
    public static void main(String args[])
    {
    Test obj = new Test();
    obj.disp();
    }
    
}

class Test
{
    int add()
    {
        int a = 29, b = 78;
        int z = a + b;
        return z;
    }
    void disp()
    {
        int x = add();
        System.out.println(" Addition = " +x);
    }
}
