public class remix
{public static void main ()
    {int a,b,d,c;
        for(a=5;a>0;a--)
        {for(b=a;b>0;b--)
                System.out.print(b);
            System.out.println();
        }

        for(a=5;a>0;a--)
        {for(b=1;b<a;b++)
                System.out.print(" ");
            for(d=a;d<6;d++)
                System.out.print(d);
            System.out.println();
        }

        for(a=1;a<6;a++)
        {for(b=1;b<=a;b++)
                System.out.print(b);
            System.out.println();
        }

        for(a=1;a<6;a++)
        {for(b=1;b<a;b++)
                System.out.print(" ");
            for(d=a;d<6;d++)
                System.out.print(d);
            System.out.println();
        }
    }}