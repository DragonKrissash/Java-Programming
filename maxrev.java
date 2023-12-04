import java.util.*;
public class maxrev
{public static void main (String args[])
    { int n,a,b,ma=0,mn=9;
        Scanner ak =  new Scanner (System.in);
        System.out.println("Enter a number");
        n=ak.nextInt();
        a=n;
     
        while(a!=0)
        {b=a%10;
         System.out.print(b);
         if(ma<b)
         ma=b;
         if(mn>b)
         mn=b;
         a=a/10;
        }
        System.out.println();
        System.out.println("The max "+ma+" The minimum "+mn);
    }}