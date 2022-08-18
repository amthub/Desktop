import java.util.Scanner;
public class Sphere {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of sphere");
        float r = sc.nextInt();
        double surfacearea = 4*(3.142*r*r);
        double volume = (4/3)*(3.142*r*r*r);
        System.out.println("Surface area = "+surfacearea);
        System.out.println("Volume = "+volume);
        
    }
}
