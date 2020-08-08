import java.util.*;
import java.lang.*;

class Codechef
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int tt=sc.nextInt();
        while(tt-->0)
        {
            int d=sc.nextInt();
            int c=sc.nextInt();
            while(d>0 && c>0)
            {
                d=d-c;
                c=c/2;
            }
            if(d>0)
            {
                System.out.println(0);
            }
            else
            {
                System.out.println(1);
            }
        }
    }
}

