import java.util.*;
class SOLBLTY
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        while (testcase-->0)
        {
            int x=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int result=(a+((100-x)*b))*10;
            System.out.println(result);
        }
    }
}
