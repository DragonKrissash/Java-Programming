import java.io.*;
public class Switch_3
{public static void main (String args[]) throws IOException
    {int s,l,b,h,r;
     double v=0;
     InputStreamReader read = new InputStreamReader (System.in);
     BufferedReader in = new BufferedReader(read);
     System.out.println("Enter 1,2,3,4 for cube,cuboid,cylinder,cone");
     s=Integer.parseInt(in.readLine());
     switch (s)
     {case 1:
         System.out.println("Enter side");
         l=Integer.parseInt(in.readLine());
         v=l*l*l;
      break;
      case 2:
         System.out.println("Enter l,b,h");
         l=Integer.parseInt(in.readLine());
         b=Integer.parseInt(in.readLine());
         h=Integer.parseInt(in.readLine());
         v=l*b*h;
      break;
      case 3:
         System.out.println("Enter r,h");
         r=Integer.parseInt(in.readLine());
         h=Integer.parseInt(in.readLine());
         v=2*(22/7)*r*h;
      break;
      case 4:
         System.out.println("Enter r,h");
         r=Integer.parseInt(in.readLine());
         h=Integer.parseInt(in.readLine());
         v=(1/3)*(22/7)*r*r*h;
      break;
      default:
      System.out.println("You have to enter 1 or 2 or 3 or 4!!!");
    }
    System.out.println("The volume of your desired shape = "+v);
    }}