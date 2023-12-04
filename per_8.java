import java.io.*;
public class per_8
{public static void main(String args[])throws IOException
    {InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the number of boys");
        double b=Double.parseDouble(in.readLine());
        System.out.println("Enter the number of girls");
        double g=Double.parseDouble(in.readLine());
        double bp=(b/(b+g))*100.0;
        double gp=(g/(b+g))*100.0;
        System.out.println("The percentage of boys: "+bp);
        System.out.println("The percentage of girls: "+gp);
    }
}