import java.util.*;
public class Loop_4
{public static void main (String args[])
    {int n,a;
        double s=0;
        System.out.println("Enter the number of terms");
        Scanner sc = new Scanner (System.in);
        n=sc.nextInt();
        for(a=1;a<=n;a++)
        {s=s+(1/(Math.pow(2,a)));
            System.out.println("The sum till n "+s);
        }
        System.out.println("The sum till n "+s);
    }}