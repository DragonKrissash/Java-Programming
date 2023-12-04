import java.util.Scanner;
public class rad_16
{public static void main()
    {Scanner s=new Scanner(System.in);
        System.out.println("Enter the volume of the sphere");
        int v=s.nextInt();
        double r=Math.cbrt((3*v)/(4*3.14));
        System.out.println("The value of the radius: "+r);
    }
}