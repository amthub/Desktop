public class Multipleexception17 {
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
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
        {

            System.out.println("not possible");//Always write in most specific to most general//
        }
        catch(Exception e)//but parent child not allowed in same catch so we can't add Exception and Aithmetic or other child in same//
        {
          System.out.println("not possible");
        }
    }
}
