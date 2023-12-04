import java.util.Scanner;
public class series_14
{public static void main()
    {Scanner s=new Scanner (System.in);
        System.out.println("Enter the values of a, b, c");
        int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
        double sum=(1/Math.pow(a,2))+(1/Math.pow(b,3))+(1/Math.pow(c,4));
        System.out.println("The value of the sum: "+sum);
    }
}