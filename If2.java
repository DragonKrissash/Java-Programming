import java.util.*;
public class If2
{public static void main (String args[]){
    int a;
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a number");
    a=sc.nextInt();
    if (a>0&&a%2==0)
    {System.out.println("The succesive even numbers are "+(a+2)+","+(a+4)+","+(a+6));
    }   
    else if (a<0&&a%2!=0)
    {System.out.println("The succesive even numbers are "+(a+2)+","+(a+4)+","+(a+6));
    }
    else {System.out.println("It is not what I want!!!!");}
}}