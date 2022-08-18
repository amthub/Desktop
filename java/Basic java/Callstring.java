public class Callstring 
{
    public static void main(String args[])
    {
    Test obj = new Test();
    System.out.println(obj.Fname());
    System.out.println(obj.Lname());
    }
}
class Test
{
    String Fname()
    {
    String s = " New delhi ";
    return s;
    }
    String Lname()
    {
        String r = " Lucknow ";
        return r;
    }
}
