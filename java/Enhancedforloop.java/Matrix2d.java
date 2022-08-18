public class Matrix2d
{
    public static void main(String args[])
    {
      int num[][] = {{11, 22, 33}, {44, 55, 66}, {77, 88, 99}};
      for(int i[]: num)
       {
       for(int j: i)
       {
         System.out.print(j+ " ");
       }
       System.out.println();
      }
    }    
}
