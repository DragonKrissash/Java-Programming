import java.util.Scanner;
public class res_31
{public static void main()
    {Scanner s=new Scanner(System.in);
        System.out.println("Enter the two resistances");
        double r1=s.nextDouble(),r2=s.nextDouble();
        System.out.println("Enter s for resistance in series and p for parallel");
        char c=s.next().charAt(0);
        switch(c)
        {case 's':
            System.out.println("The resistance in series: "+(r1+r2));
            break;
            case 'p':
            double req=(r1*r2)/(r1+r2);
            System.out.println("The resistance in parallel: "+req);
            break;
            default:
            System.out.println("Wrong choice");
        }
    }
}