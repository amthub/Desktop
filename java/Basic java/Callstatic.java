public class Callstatic {
 public static void main(String args[])
 {
 Test.disp();
 }   
}
class Test
{
    static void disp()
    {
        int a = 19;
        int b = 27;
        int z = a * b;
        System.out.println(" value of z = " +z);
    }
}
