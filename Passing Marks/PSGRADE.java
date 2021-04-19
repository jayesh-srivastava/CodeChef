import java.util.*;
class PSGRADE
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        while(testcase-->0)
        {
            int amin=sc.nextInt();
            int bmin=sc.nextInt();
            int cmin=sc.nextInt();
            int tmin=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            System.out.println((a>=amin&&b>=bmin&&c>=cmin&&(a+b+c)>=tmin)?"Yes":"No");

        }
    }
}
