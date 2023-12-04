import java.util.Scanner;
public class ndsml_20
{public static void main()
    {Scanner s=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
        int sml=0;
        if(a!=b && b!=c && c!=a)
        {if(a>b)
            {if(b>c)
                    sml=b;
                else
                    sml=c;}
            else
            {if(a>c)
                    sml=a;
                else
                    sml=c;
            }
        
        System.out.println("The 2nd smallest: "+sml);}
        else
        System.out.println("All the numbers are not different");
        
    }
}