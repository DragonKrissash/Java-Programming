import java.util.Scanner;
public class tax_30
{public static void main()
    {Scanner s=new Scanner(System.in);
        System.out.println("Enter name, age, income of a person");
        String name=s.next();int age=s.nextInt(),inc=s.nextInt();
        double tax=0;
        if(age>60)
            System.out.println("No tax applicable");
        else
        {if(inc<=250000)
                tax=0;
            else if(inc>250000 && inc<=500000)
                tax=(inc-160000)*(10.0/100.0);
            else if(inc>500000 && inc<=1000000)
                tax=(inc-500000)*(20.0/100.0)+34000;
            else 
                tax=(inc-1000000)*(30.0/100.0)+94000;
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
            System.out.println("Tax: "+tax);
        }
    }
}
 