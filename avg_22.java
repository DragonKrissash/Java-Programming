import java.util.Scanner;
public class avg_22
{public static void main()
    {Scanner s=new Scanner(System.in);
        System.out.println("Enter the marks in Math, Physics, Chemistry");
        int m=s.nextInt(),p=s.nextInt(),c=s.nextInt();
        int avg=(m+p+c)/3;
        String gr="";
        if(avg>=80)
            gr="Distinction";
        else if(avg<80 && avg>=60)
            gr="1st Class";
        else if(avg<60 && avg>=45)
            gr="2nd class";
        else if(avg<45 && avg>=40)
            gr="Pass";
        else
            gr="FAIL";

        System.out.println("The grade of the student: "+gr);
    }
}