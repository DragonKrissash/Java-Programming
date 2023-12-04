import java.util.Scanner;
public class min_12
{public static void main()
    {Scanner in =new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a=in.nextInt(),b=in.nextInt(),c=in.nextInt();
        int t=Math.min(a,b);
        int min=Math.min(t,c);
        System.out.println("The minimum among the 3: "+min);
    }
}