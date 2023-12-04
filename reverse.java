import java.util.*;
public class reverse
{public static void main (String args[])
    { int n,a,b;
        Scanner ak =  new Scanner (System.in);
        System.out.println("Enter a number");
        n=ak.nextInt();
        a=n;
        while(a!=0)
        {b=a%10;
         System.out.println(b);
         a=a/10;
        }
    }}