import java.util.Scanner;
public class switch_27
{public static void main()
    {Scanner s=new Scanner(System.in);
        System.out.println("Enter 1 for natural log, 2 for absolute value, 3 for square root, 4 for cube root, 5 for random number");
        int n=s.nextInt();
        switch(n)
        {case 1:System.out.println("Enter a number to calculate natural log");
            int n2=s.nextInt();
            System.out.println("The natural log of "+n2+" : "+Math.log(n2));
            break;
            case 2:
            System.out.println("Enter a number to calculate absolute value");
            double n3=s.nextDouble();
            System.out.println("The absolute value of number is: "+Math.abs(n3));
            break;
            case 3:
            System.out.println("Enter a number to calculate square root");
            int n4=s.nextInt();
            System.out.println("The square root of the number: "+Math.sqrt(n4));
            break;
            case 4:
            System.out.println("Enter a number to calculate cube root");
            int n5=s.nextInt();
            System.out.println("The cube root of the number: "+Math.cbrt(n5));
            break;
            case 5:
            System.out.println("A randome number: "+Math.random());
            break;
            default:
            System.out.println("Wrong input");
        }
    }
}