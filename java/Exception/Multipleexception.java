class Multipleexception
{
   public static void main(String args[])
    {
        try{ 
        int a = 100/2;
        int arr[] = new int[5];
        System.out.println("the value of a is = "+a);
        arr[8] = 22;
        System.out.println("the value of arr is = "+arr[4]);
        String st = "Amit";
        System.out.println("the value of a is = "+st);
        }
        catch(ArithmeticException e)
        {

            System.out.println("not possible");//Always write in most specific to most general//
        }
        catch(Exception e)
        {
          System.out.println("not possible");
        }


    }
}