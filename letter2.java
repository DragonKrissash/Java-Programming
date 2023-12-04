public class letter2
{public static void main (String args[])
    {int a,b,c,d;
        System.out.print("      **");
        System.out.println();
        for(a=1;a<6;a++)
        {
         for(b=5;b>=a;b--)
         System.out.print(" ");
         System.out.print("*");
         if(a==3)
         for(d=1;d<2;d++)
         System.out.print("******");
         for(c=1;c<=a;c++)
         {if(a==3)
             break;
             System.out.print("  ");}
         System.out.print("*");
         System.out.println();
        }
    }}