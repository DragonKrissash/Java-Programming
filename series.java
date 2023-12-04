import java.util.*;
public class series
{public static void main (String args[])
    {double n,a=1,b=0;
        Scanner ak = new Scanner (System.in);
        System.out.println("Enter till the natural reci of power 2");
        n=ak.nextDouble();
        do
        {b=b+(1/Math.pow(2,a));
        a++;}
        while(a<=n);
        System.out.println("The sum "+b);
    }}