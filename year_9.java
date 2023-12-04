import java.io.*;
public class year_9
{public static void main(String args[])throws IOException
    {InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the number of days");
        int n=Integer.parseInt(in.readLine());
        int y=n/365;int t=n%365,m=t/30,d=t%30;
        System.out.println("The no of years: "+y);
        System.out.println("The no of months: "+m+"\nThe no of days: "+d);
    }
}