import java.util.*;
public class elec_23
{public static void main()
    {Scanner s=new Scanner(System.in);
        System.out.println("Enter the name of the customer");
        String name=s.next();
        System.out.println("Enter the customer number");
        String cusnum=s.next();
        System.out.println("Enter the number of units");
        int n=s.nextInt();
        double tax=0;
        if(n<=100)
            tax=1.8*n;
        else if(n>100 && n<=300)
            tax=100*1.8+(n-100)*2.3;
        else if(n>300 && n<=500)
            tax=100*1.8+2.3*200+2.8*(n-300);
        else
            tax=1.8*100+2.3*200+2.8*200+3.5*(n-500);
        System.out.println("The name of the customer: "+name+"\nThe customer number: "+cusnum+"\nThe tax to be paid: "+tax);
    }
}