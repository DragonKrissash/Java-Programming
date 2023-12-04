import java.util.*;
public class TENINONE
{public static void main (String args[])
    {Scanner ak = new Scanner (System.in);
        int l=1;
        do
        {System.out.println("Enter a number between 1 to 10");
            int n=ak.nextInt();
            switch (n)
            {   case 1:
                System.out.println("Enter a number to know it is odd or even");
                int a=ak.nextInt();
                if(a%2==0)
                    System.out.println("It is even number " +a);
                else
                    System.out.println("It is odd number "+a);
                break;

                case 2:
                System.out.println("Enter a number to know it is prime or not");
                int s=0;
                int c=ak.nextInt();
                for(int b=1;b<=c;b++)
                    if(c%b==0)
                    {s=s+1;
                        System.out.print(b+" ");}
                if(s==2)
                    System.out.println("It is a prime number "+c);
                else 
                    System.out.println("It is not a prime number "+c);
                break;

                case 3:
                System.out.println("Enter a number to know if it is palindrome or not");
                int d=ak.nextInt();
                int num=0,ld,t=d;
                while(t>0)
                {ld=t%10;
                    num=num*10+ld;
                    System.out.print(num);
                    t=t/10;}
                if(num==d)
                    System.out.println("It is a palindrome number "+d);
                else
                    System.out.println("It is not a palindrome number "+d);
                break;

                case 4:
                System.out.println("Enter a number to know if it is buzz number or not");
                int bz=ak.nextInt();
                if(bz%10==7)
                    System.out.println("It is a buzz number "+bz);
                else if(bz/7==0)
                    System.out.println("It is a buzz number "+bz);
                else
                    System.out.println("It is not a buzz number "+bz);
                break;

                case 5:
                System.out.println("Enter a number to know if it is positive or negative");
                int inte=ak.nextInt();
                if(inte>0)
                    System.out.println("It is a positive number "+inte);
                else if(inte==0)
                    System.out.println("It is not positive or negative "+inte);
                else
                    System.out.println("It is negative number "+inte);
                break;

                case 6:
                System.out.println("Enter a number to know it is pronic or not");
                int pronic=ak.nextInt();
                int lp=1,ts=0;
                while(lp<=pronic)
                {if(lp*(lp+1) == pronic)
                    {System.out.println("It is a pronic number "+lp+ "*" +(lp+1)+ "=" +lp*(lp+1));ts++;}
                    lp++;}
                if(ts!=1)

                    System.out.println("It is not a pronic number "+pronic);
                break;

                case 7:
                System.out.println("Enter a number to know it is happy number or not");
                int hn=ak.nextInt();
                int te,ld1,ld2=1,sum=0,sq,sq2,sum2=0;
                te=hn;
                sq=te*te;//49
                while(ld2<101)
                {
                    while(sq>0)//130
                    {ld1=sq%10;  //0//1
                        sq2=ld1*ld1;//0//1//
                        sum=sum+sq2;//0//1//
                        
                        sq=sq/10;}  //1//0//
                    sq=sum;//97//130/10

                    if(sum==1)
                        break;
                    sum=0;
                    ld2++;}
                if(sum==1)
                    System.out.println("It is a happy number");
                else
                    System.out.println("It is not a happy number");
                break;

                case 8:
                System.out.println("Enter a number to know it is sad number or not");
                hn=ak.nextInt();
                ld2=1;sum=0;sum2=0;
                te=hn;
                sq=te*te;//49
                while(ld2<101)
                {
                    while(sq>0)//130
                    {ld1=sq%10;  //0//1
                        sq2=ld1*ld1;//0//1//
                        sum=sum+sq2;//0//1//
                        
                        sq=sq/10;}  //1//0//
                    sq=sum;//97//130/10
                    if(sum==1)
                        break;
                    sum=0;
                    ld2++;}
                if(sum==1)
                    System.out.println("It is not a sad number");
                else
                    System.out.println("It is a sad number");
                break;

                case 9:
                System.out.println("Enter a number to know it is neon number or not");
                int no=ak.nextInt();
                int tem,ldg,squ,su=0;
                tem=no;//25
                squ=tem*tem;//625
                while(squ!=0)
                {
                    ldg=squ%10;//5//2
                    su=su+ldg;//5//7
                    
                    squ=squ/10;//62//6
                }       
                if(su==no)
                    System.out.println("It is a neon number");
                else
                    System.out.println("It is not a neon number");
                break;

                case 10:
                System.out.println("Enter a number to know it is armstrong number or not");
                int nume=ak.nextInt();
                int temp,lt,cu,suu=0;
                temp=nume;//153

                while(temp!=0)
                {
                    lt=temp%10;//3//5//1
                    cu=lt*lt*lt;//27//125//1
                    suu=suu+cu;//27//27+125//27+125+1
                    
                    temp=temp/10;//15//1//0
                }       
                if(suu==nume)
                    System.out.println("It is a armstrong number");
                else
                    System.out.println("It is not a armstrong number");
                break;
                default:
                System.out.println("Wrong input");}
            l++;
            System.out.println();}
        while(l<11);
    }
}
 