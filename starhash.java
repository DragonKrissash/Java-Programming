public class starhash
{public static void main (String args[])
    {int a,b,c;
        for(a=1;a<6;a++)
        {if(a%2!=0)
            for(b=1;b<=a;b++)
            System.out.print("*");
            
         if (a%2==0)
            for (b=1;b<=a;b++)
            System.out.print("#");
            System.out.println();
        }}}
                