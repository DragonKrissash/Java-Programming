import java.io.*;
public class Switch_2
{public static void main (String args [])throws IOException
    {int a,b;
        char c;
        double d=0;
        String E = "Series";
        String F = "Parallel";
        InputStreamReader read = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter R1 and R2");
        a=Integer.parseInt(in.readLine());
        b=Integer.parseInt(in.readLine());
        System.out.println("Enter ur type of circuit (Enter S or P) ");
        c=(char)(in.read());
        switch (c)
        { case 'P':
            d=a+b;
            System.out.println("Equivalent resistance in "+F+"="+d);
          break;
          case 'S':
            d=(a*b)*(a-b);
            System.out.println("Equivalent resistance in "+E+"="+d);
          break;
          default:
          System.out.println("You should enter other type of circuit's first letter!!");
          
        }
    }}