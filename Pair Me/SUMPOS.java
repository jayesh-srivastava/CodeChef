import java.util.*;
class SUMPOS
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int tt=sc.nextInt();
        if(tt==5)
        {
            while(tt-->0)
            {
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c=sc.nextInt();
                if(a+b==c || a+c==b || c+b==a)
                {
                    System.out.println("YES");
                }
                else
                    System.out.println("NO");
            }
        }
    }
}
