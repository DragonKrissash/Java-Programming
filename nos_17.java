import java.util.Scanner;
public class nos_17
{public static void main()
    {Scanner is=new Scanner (System.in);
        System.out.println("Enter 2 numbers");
        int a=is.nextInt(),b=is.nextInt();
        int s,c;
        if(a==b)
        {System.out.println("The numbers are equal");}
        else
        {if(a>b)
            { s=b*b;
                c=a*a*a; } 
            else
            {s=a*a;
                c=b*b*b;

            }
            System.out.println("The square of smaller number: "+s);
            System.out.println("The cube of larger number: "+c);
        }
    }
}