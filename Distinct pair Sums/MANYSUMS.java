import java.util.*;
class MANYSUMS
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int tt=sc.nextInt();
        int sum=0;
        while(tt-->0)
        {
            int t1=sc.nextInt();
            int t2=sc.nextInt();
            if(t1==t2) {
                System.out.println("1");
            }
            else
            {
                sum=2*t2 - (2*t1) + 1;
                System.out.println(sum);
            }
        }
    }
}
