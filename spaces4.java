public class spaces4
{public static void main (String args[])
    { int a,b,c;
        for(a=1;a<6;a++)
        {for(c=1;c<a;c++)
         System.out.print(" ");
         
            for(b=5;b>=a;b--)
            System.out.print("* ");
            System.out.println();
        }
        for(a=5;a!=0;a--)
        {
            for(b=1;b<a;b++)
                System.out.print(" ");
            for(c=5;c>=a;c--)
                System.out.print("* ");
            System.out.println();
        }
        
    }}