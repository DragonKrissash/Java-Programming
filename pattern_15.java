public class pattern_15
{
    public static void main()
    {
        int i=5,j;
        do
        {
            j=1;
            do
            {
                System.out.print(i);
                j++;
            }
            while(j<6);
            System.out.println();
            i--;
        }
        while(i>0);
    }
}