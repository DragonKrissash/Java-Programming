import java.util.*;
public class diamon2
{public static void main ()
    {int n,t,a,b,c;
        Scanner ak = new Scanner (System.in);
        System.out.println("Enter a number");
        n= ak.nextInt();
        t=n;

        int h=(t+1)/2;
        int oh=(t-1)/2;
        for(a=1;a<=h;a++)
        {
            for(b=h;b>a;b--)
                System.out.print(b);
            if(a==h)
                System.out.print("|");
            else
                System.out.print("/");
            for(c=a;c>0;c--)
                System.out.print(c);
            for(int d=2;d<=a;d++)
                System.out.print(d);
            if(a==h)
                System.out.print("|");
            else
                System.out.print("\\");
            for(int e=a+1;e<=h;e++)
                System.out.print(e);
            System.out.println();
        }
        for(a=oh;a>0;a--)
        {
            for(b=h;b>a;b--)
                System.out.print(b);
            System.out.print("\\");
            for(c=a;c>0;c--)
                System.out.print(c);
            for(int d=2;d<=a;d++)
                System.out.print(d);
            System.out.print("/");
            for(int e=a+1;e<=h;e++)
                System.out.print(e);
            System.out.println();
        }
    }
}
 