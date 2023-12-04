import java.util.*;
public class neon
{public static void main (String args[])
    {int n,t,r=0;
        System.out.println("Enter a number");
        Scanner ak = new Scanner (System.in);
        n=ak.nextInt();
        t=n;
        
        while(t!=0)//151
        {t=t%10;//
         r=r+t;
         t=t/10;
        }
        if(r==n)
        System.out.println("It is a neon number");
        else
        System.out.println("It is not a neon number");
    }}