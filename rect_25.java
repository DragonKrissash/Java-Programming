import java.util.Scanner;
public class rect_25
{public static void main()
    {Scanner s=new Scanner (System.in);
        System.out.println("Enter the length and breadth of the rectangle");
        int l=s.nextInt(),b=s.nextInt();
        System.out.println("Enter your choice 1 for area, 2 for perimeter, 3 for diagonol");
        int ch=s.nextInt();
        switch(ch)
        {case 1:System.out.println("The area: "+(l*b));
            break;
            case 2:System.out.println("The perimeter: "+(2*(l+b)));
            break;
            case 3:System.out.println("The length of diagonol: "+Math.sqrt(l*l+b*b));
            break;
            default:System.out.println("Wrong choice");
        }
    }
}