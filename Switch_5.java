import java.io.*;
public class Switch_5
{public static void main (String args[]) throws IOException
    {   String nm;
        int c;
        int p=0;
        double d=0,na=0;
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader ak = new BufferedReader(read);
        System.out.println("Enter your name Sir/Mam");
        nm=ak.readLine();
        System.out.println("Enter your choice for appliance (D=1 or L=2)");
        c=Integer.parseInt(ak.readLine());
        switch (c)
        { case 1:
            System.out.println("Enter your price of laptop");
            p=Integer.parseInt(ak.readLine());
            if (p<25001)
            d=0;
            if (p>25000 && p<50001)
            d=p*5/100;
            if (p>50000 && p<100001)
            d=p*7.5/100;
            if (p>100000)
            d=p*1/10;
            na=p-d;
          break;
          case 2:
            System.out.println("Enter your price of desktop");
            p=Integer.parseInt(ak.readLine());
            if (p<25001)
            d=p*5/100;
            if (p>25000 && p<50001)
            d=p*7.5/100;
            if (p>50000 && p<100001)
            d=p*10/100;
            if (p>100000)
            d=p*15/100;
            na=p-d;
          break;
          default:
            System.out.println("You should enter capital D or L");
            System.exit(0);
        }
        System.out.println("Name of the customer"+nm);
        System.out.println("The price of the appliance Sir/Mam "+nm+"="+p);
        System.out.println("The discount on the appliance Sir/Mam "+nm+"="+d);
        System.out.println("The final amount to be paid Sir/Mam "+nm+"="+na);
    }}