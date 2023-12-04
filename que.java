//     1
//    21
//   321
//  4321
// 54321

public class que
{public static void main ()
    {int a,b,c;
        for(a=1;a<6;a++)
        {for (b=5;b>a;b--)
                System.out.print(" ");
            for(c=a;c>0;c--)
                System.out.print(c);
            System.out.println();
        }}}