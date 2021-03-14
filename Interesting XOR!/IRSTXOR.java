import java.util.*;
class IRSTXOR
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        while(testcase-->0)
        {
            long c=sc.nextInt();
            long a=1;
            long b=0;
            while(b<=c)
            {
                b=(long)Math.pow(2,a);
                a++;
            }
            long z=(long)Math.pow(2,a-2)-1;
            long sum=b-c;
            long result=z*(z+sum);
            System.out.println(result);
        }
    }
}
