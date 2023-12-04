import java.util.Scanner;
public class neno_18
{public static void main()
    {Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();
        if(n>0 && n%2==0)
            System.out.println("The succeeding numbers: "+(n+2)+", "+(n+4)+", "+(n+6));
        else if(n<0 && n%2!=0)
            System.out.println("The preceeding numbers: "+ (n-2)+", "+(n-4)+", "+(n-6));
        else
            System.out.println("Input is not accepted");
    }
}