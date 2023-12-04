import java.util.*;
public class quad_24
{public static void main()
    {Scanner s=new Scanner(System.in);
        System.out.println("Enter the values of a, b, c");
        int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
        double d=b*b-4*a*c;
        if(d==0)
            System.out.println("Roots are equal");
        else if(d>0)
            System.out.println("Roots are real and unequal");
        else
            System.out.println("Roots are imaginary");
    }
}