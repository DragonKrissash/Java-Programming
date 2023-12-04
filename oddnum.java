import java.util.*;
public class oddnum
{public static void main ()
    {int s=0,a,n;
        Scanner ak = new Scanner (System.in);
        System.out.println("Enter a number");
        n=ak.nextInt();
        for(a=1;a>0;a+=2)
        {s=s+a;
            if(s==(n*n))
            break;}
          System.out.println(a);  
    }}
            