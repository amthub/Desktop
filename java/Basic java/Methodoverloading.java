public class Methodoverloading {
    public static void main(String args[])
    {
    Addition obj = new Addition();
    obj.disp(20, 16);
    obj.disp(15, 29.8f);
    }
}

class Addition
{
    void disp(int a, int b)
    {
        int z = a + b;
        System.out.println(z);

    }
    void disp(int a, float b)
    {
        float z = a + b;
        System.out.println(z);
    }
}
    

