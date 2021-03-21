import java.util.*;
class WEIGHTBL
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        while(testcase-->0)
        {
            int w1=sc.nextInt();
            int w2=sc.nextInt();
            int x1=sc.nextInt();
            int x2=sc.nextInt();
            int m=sc.nextInt();
            System.out.println(((w2-w1)<(x1*m) || (w2-w1)>(x2*m))?"0":"1");
        }
    }
}
