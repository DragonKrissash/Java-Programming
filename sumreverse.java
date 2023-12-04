import java.util.*;
public class sumreverse
{public static void main (String args[])
    { int n,a,b,c=0;
        Scanner ak =  new Scanner (System.in);
        System.out.println("Enter a number");
        n=ak.nextInt();
        a=n;
        while(a!=0)
        {b=a%10;
         System.out.println(b);
         c=c+b;
         a=a/10;
        }
        System.out.println("The sum of digits "+c);
    }}