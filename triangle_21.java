import java.util.Scanner;
public class triangle_21
{public static void main()
    {Scanner s=new Scanner(System.in);
        System.out.println("Enter the three sides of the triangle");
        int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
        if(a+b>c && b+c>a && c+a>b)
        {if(a==b && b==c)
                System.out.println("The triangle is equilateral");
            else if(a!=b && b!=c && c!=a)
                System.out.println("The triangle is scalene");
            else
                System.out.println("The triangle is isoceles");
        }
        else
            System.out.println("The triangle is not possible");
    }
}

