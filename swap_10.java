import java.util.Scanner;
public class swap_10
{public static void main(String args[])
    {Scanner krish=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=krish.nextInt();
        System.out.println("Enter another number");
        int b=krish.nextInt();
        int c=0;
        c=a;a=b;b=c;
        System.out.println("The value of a after swapping: "+a+" and b after swapping: "+b);
    }
}