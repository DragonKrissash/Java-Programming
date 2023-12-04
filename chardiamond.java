import java.util.*;
public class chardiamond
{public static void main ()
    {int h,oh,c=65,a,n,t;
        Scanner ak = new Scanner (System.in);
        System.out.println("Enter a number");
        n=ak.nextInt();
        t=n;
        h=(t+1)/2;
        oh=(t-1)/2;
        for(a=1;a<=h;a++)
        {
            for(int d=1;d<=h+1-a;d++)
            System.out.print(" ");
            System.out.print((char)c);
            if(a>1)
            {for(int b=1;b<=2*a-3;b++)
                if(a==h && b==h-1)
                System.out.print("K");
                else
                System.out.print(" ");
            System.out.print((char)c);}
            c++;
            System.out.println();
        }
        c-=2;
        for(a=oh;a>0;a--)
            {for(int d=h;d>=a;d--)
            System.out.print(" ");
            System.out.print((char)c);
            if(a!=1)
            {for(int b=1;b<=2*a-3;b++)
                System.out.print(" ");
            System.out.print((char)c);
            c--;}
            System.out.println();
        }
}}