import java.util.*;
public class twoNum
{public static void main (String args[])
    {int a,b,c=1;
        Scanner ak = new Scanner (System.in);
        while(c<11)
        {System.out.println("Enter 2 numbers");
            a=ak.nextInt();
            b=ak.nextInt();
            if(a==b)
            System.out.println("The product: "+ (a*b));
            c++;}
        }}
