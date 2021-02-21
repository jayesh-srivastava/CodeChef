import java.util.*;
class CCBTS01
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        int c1=0,c2=0,c3=0;
        while(testcase-->0)
        {
            String s=sc.next();
            for(int x=0;x<3;x++)
            {
                char ch=s.charAt(x);
                if(ch=='P')
                    c1++;
                else if(ch=='C')
                    c2++;
                else if(ch=='M')
                    c3++;
                else{}
            }
            if(c1==1 && c2==1 && c3==1)
                System.out.println("YES");
            else
                System.out.println("NO");
            c1=0;
            c2=0;
            c3=0;
        }
    }
}
