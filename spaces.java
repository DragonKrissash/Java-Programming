public class spaces
{public static void main (String args[])
    { int a,b,c;
        for(a=5;a!=0;a--)
        {
            for(b=1;b<a;b++)
                System.out.print(" ");
            for(c=5;c>=a;c--)
                System.out.print("* ");
            System.out.println();
        }
    }}