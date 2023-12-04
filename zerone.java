import java.util.*;
public class zerone
{public static void main ()
    {int n,t;
        Scanner ak = new Scanner (System.in);
        System.out.println("Enter a number");
        n=ak.nextInt();
        t=n;
        if(t%2!=0)
        for(int a=t;a>0;a--)
        {for(int b=a;b<=t;b++)
                if(b%2==0)
                    System.out.print("0");
                else
                    System.out.print("1");
            System.out.println();
        }
        else
        for(int a=t;a>0;a--)
        {for(int b=a;b<=t;b++)
                if(b%2==0)
                    System.out.print("1");
                else
                    System.out.print("0");
            System.out.println();
        }
    }
}