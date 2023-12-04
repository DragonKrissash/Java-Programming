import java.util.*;
public class rev2
{public static void main (String args[])
    {int a=1,b=1,c,t,s=0,m;
        double avg;
        Scanner ak= new Scanner (System.in);

        while(a<11)
        {avg=0;t=0;s=0;m=0;b=1;
            System.out.println();
            System.out.println("Enter 6 marks of your subject");
            while(b<7)
            { m=ak.nextInt();
                t=m;
                s=s+t;
             b++;}
            avg=s/6;
            System.out.println("The total marks = "+s);
            System.out.println("The Average marks = "+avg);
         a++;
        }
    }}
 