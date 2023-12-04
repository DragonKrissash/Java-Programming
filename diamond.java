import java.util.*;
public class diamond

{public static void main ()
    {int t,n,a,b,c,h,oh;
        Scanner ak = new Scanner (System.in);
        System.out.println("Enter a number");
        n=ak.nextInt();
        t=n;//9
        h=(t+1)/2;
        oh=(t-1)/2;
        int d=1;
        for(a=1;a<=h;a++)
        {for(b=h;b>=a;b--)
                System.out.print(" ");
            for(c=1;c<=2*a-1;c++)
                {System.out.print("*");d++;}
            System.out.println();
        }
        for(a=oh;a>0;a--)
        {for(b=h;b>=a;b--)
                System.out.print(" ");
            for(c=1;c<=2*a-1;c++)
                {System.out.print("*");d++;}
            System.out.println();
        }
    }}