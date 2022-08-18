class Instwithpara 
{
    public static void main(String args[])
    {
     Test obj = new Test();
     obj.disp(20 , 15);
    }
}   
    class Test
    {
        void disp(int a, int b)
        {
            int z = a + b;
            System.out.println(z);
        }
    }
