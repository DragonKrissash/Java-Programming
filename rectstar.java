import java.util.*;
public class rectstar
{public static void main (String args[])
    {int a,b,c,d;
        Scanner ak=new Scanner (System.in);
        System.out.println("Enter a number");
        int e=ak.nextInt();   
        System.out.println();
        for(a=e;a>0;a--)
        {
            for(b=1;b<=e;b++)
            {   
                if((e+1)-(a+b)==0 && a==b)
                System.out.print("X");
                else if (b==a)
                System.out.print("/");
                else if (b==e+1-a)
                System.out.print("\\");
                else 
                System.out.print("*");}
            
            System.out.println();
        }}}
