import java.util.Scanner;
public class vol_13
{public static void main()
    {Scanner s=new Scanner(System.in);
        System.out.println("Enter the volume of cube");
        int vol=s.nextInt();
        double side=Math.cbrt(vol);
        System.out.println("The side of the cube: "+side);
    }
}