import java.util.Scanner;
public class emp_11
{public static void main()
    {Scanner in=new Scanner(System.in);
        System.out.println("Enter the name of the employee");
        String name=in.next();
        System.out.println("Enter the basic salary of the employee");
        double bsal=in.nextDouble();
        double da=(30.0/100.0)*bsal;
        double hra=(12.5/100.0)*bsal;
        double pf=(10.0/100.0)*bsal;
        double gross=bsal+hra+da;
        double netpay=gross-pf;
        System.out.println("The gross salary: "+gross);
        System.out.println("The net salary: "+netpay);
    }
}