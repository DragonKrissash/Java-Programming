import java.io.*;
public class Switch_4
{public static void main (String args[])throws IOException
    {   int p,t,r;
        double a=0,in=0;
        char i;
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader ak = new BufferedReader(read);
        System.out.println("Enter P T R respectively");
        p=Integer.parseInt(ak.readLine());
        t=Integer.parseInt(ak.readLine());
        r=Integer.parseInt(ak.readLine());
        System.out.println("Enter your type of interest (C or S)");
        i=(char)(ak.read());
        switch (i)
        {case 'C':
            in=p*((Math.pow((1+r/100),t))-1);
            a=p+in;
         break;
         case 'S':
            in=(p*t*r)/100;
            a=in+p;
         break;
         default:
         System.out.println("You should enter capital C or S");
         System.exit(0);
        }
        System.out.println("The total interest = "+in);
        System.out.println("The total amount = "+a);
    }}