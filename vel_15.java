import java.util.Scanner;
public class vel_15
{public static void main()
    {Scanner is=new Scanner(System.in);
        System.out.println("Enter the values of a, s, u");
        int a=is.nextInt(),s=is.nextInt(),u=is.nextInt();
        double v=Math.sqrt(u*u+2*a*s);
        System.out.println("The final velocity is: "+v);
    }
}