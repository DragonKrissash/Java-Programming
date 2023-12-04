import java.util.Scanner;
public class angle_26
{public static void main()
    {Scanner s=new Scanner(System.in);
        System.out.println("Enter the angle");
        int ang=s.nextInt();
        System.out.println("Enter c for complementary and s for supplementary angle");
        char c=s.next().charAt(0);
        switch(c)
        {case 'c':System.out.println("The complementary angle: "+(90-ang));
            break;
            case 's':System.out.println("The supplementary angle: "+(180-ang));
            break;
            default:System.out.println("Wrong input");
        }
    }
}