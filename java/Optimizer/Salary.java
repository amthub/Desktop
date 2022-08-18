import java.util.Scanner;
class Salary
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int salary, HRA, DA, Total;
            System.out.println("Enter the salary");
            salary = sc.nextInt();
            DA = (salary*3)/100;
            HRA = (salary*98)/100;
            Total  = salary + DA + HRA;
            System.out.println("total salary is = "+Total);

        }
        
    
    
}