import java.util.Scanner;
public class mon_28
{public static void main()
    {Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of p, r, n");
        double p=s.nextDouble(),r=s.nextDouble(),n=s.nextDouble();
        System.out.println("Enter 1 for term deposit and 2 for recurring deposit");
        int ch=s.nextInt();
        switch(ch)
        {case 1:
            double a=p*Math.pow((1+(r/100)),n);
            System.out.println("The term amount: "+a);
            break;
            case 2:
            double am=n*p+((n*(n+1))/2)*(r/100)*(1/12);
            System.out.println("The recurring amount: "+am);
            break;
            default:System.out.println("Wrong choice");
        }
    }
}