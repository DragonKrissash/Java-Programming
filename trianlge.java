import java.util.*;
public class trianlge
{public static void main (String args [])
    {int a,b,c;
        Scanner ak = new Scanner (System.in);
        System.out.println("Enter a number 1 or 2");
        a=ak.nextInt();
        switch(a)
        {case 1:
            for (b=1;b<7;b++)
            {for (c=1;c<=b;c++)
                System.out.print(b);
                System.out.println();
            }
            break;
         case 2:
            for (b=6;b!=0;b--)
            {for (c=b;c!=0;c--)
                System.out.print(b);
                System.out.println();
            }
            break;
         default:
         System.out.println("Wrong enter");
        }
     int d;
     System.out.println("Enter another choice");
     d=ak.nextInt();
     switch(d)
        {case 1:
            for (b=1;b<7;b++)
            {for (c=1;c<=b;c++)
                System.out.print(b);
                System.out.println("");
            }
            break;
         case 2:
            for (b=6;b!=0;b--)
            {for (c=b;c!=0;c--)
                System.out.print(b);
                System.out.println("");
            }
            break;
         default:
         System.out.println("Wrong enter");
        }
    }}