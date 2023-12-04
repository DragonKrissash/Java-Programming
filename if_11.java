import java.util.*;
public class if_11
{public static void main (String args[])
    {int a;
       char c='A';
        Scanner ak = new Scanner (System.in);
        System.out.println("Enter your marks");
        a=ak.nextInt();
        if (a>85)
        c='A';
        if(a<86 && a>59)
        c='A';
        if (a<60 && a>49)
        c='B';
        if (a<50 && a>39)
        c='C';
        if (a<40)
        c='F';
        System.out.println("Your grade: "+c);
    }}