import java.util.Scanner;
public class thr_fiv_29
{public static void main()
    {Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();
        if(n%15==0)
            System.out.println("The number is divisible by 3 and 5");
        else if(n%3==0 && n%5!=0)
            System.out.println("The number is divisible by 3 and not 5");
        else if(n%3!=0 && n%5==0)
            System.out.println("The number is divisible by 5 and not 3");
        else
            System.out.println("The number is not divisible by 3 and 5");
    }
}
 