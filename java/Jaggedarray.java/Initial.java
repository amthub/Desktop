

public class Initial {
    public static void main(String args[])
    {
        int num[][] = new int[2][];
        num[0] = new int[2];
        num[1] = new int[1];
       
        
        num[0][0] = 11;
        num[0][1] = 23;
        num[1][0] = 34;
        
        for(int i= 0; i<num.length; i++){
            for(int j=0; j<num[i].length; j++)
            {
                System.out.print(num[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
