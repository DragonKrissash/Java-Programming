import java.io.*;
public class revision
{public static void main (String args[])throws IOException
    {
        InputStreamReader read= new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader(read);
        int a,b;
            char c;
        for(int e=1;e<5;e++)
        {
            System.out.println("Enter A or B or C or D");
            c=(char)(in.read());

            switch (c)
            {case 'A':
                for(a=5;a>0;a--)
                {for(b=a;b>0;b--)
                        System.out.print(b);
                    System.out.println();
                }
                break;
                case 'B':
                for(a=5;a>0;a--)
                {for(b=1;b<a;b++)
                        System.out.print(" ");
                    for(int d=a;d<6;d++)
                        System.out.print(d);
                    System.out.println();
                }
                break;
                case 'C':
                for(a=1;a<6;a++)
                {for(b=1;b<=a;b++)
                        System.out.print(b);
                    System.out.println();
                }
                break;
                case 'D':
                for(a=1;a<6;a++)
                {for(b=1;b<a;b++)
                        System.out.print(" ");
                    for(int d=a;d<6;d++)
                        System.out.print(d);
                    System.out.println();
                }
                break;
                default:
                System.out.println("Entered a wrong");
            }
        }
    }
}