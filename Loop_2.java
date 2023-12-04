import java.io.*;
public class Loop_2
{ public static void main (String args[])throws IOException
    {int a;
        double c=1;
        System.out.println("Enter a number");
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (read);
        a=Integer.parseInt(in.readLine());
        System.out.println("The table of the number: " );
        for (c=1;c<=99999999;c++)
        {
            double b= (double)a*c;
            System.out.println(a+" "+ '*'+" "+ c+" "+ '='+" "+ b);

        }
    }  
    }