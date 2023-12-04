import java.util.*;
class Rect
{
    public static void main (String args[])
    {
        int l,b,a,p;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the length and breadth of the rectangle");
        l=sc.nextInt();
        b=sc.nextInt();
        p=2*(l+b);
        a=l*b;
        System.out.println("The area is="+a);
        System.out.println("The perimeter is="+p);    
}}