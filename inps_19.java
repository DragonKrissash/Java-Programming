import java.util.Scanner;
public class inps_19
{public static void main()
    {Scanner s=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a=s.nextInt(),b=s.nextInt(),c=s.nextInt();
        System.out.println("Enter s for sum and p for product");
        char ch=s.next().charAt(0);
        if(ch=='p')
            System.out.println("The product of the numbers: "+(a*b*c));
        else if(ch=='s')
            System.out.println("The sum of the numbers: "+(a+b+c));
        else
            System.out.println("Wrong input!");
    }
}