import java.util.*;
class SSCRIPT
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        int count=0;
        int max=0;
        while(testcase-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            for(int x=0;x<n;x++)
            {
                char ch=s.charAt(x);
                if(ch=='*') {
                    count++;
                    max=Math.max(count,max);
                }
                else
                    count=0;
            }
            System.out.println(max<k?"NO":"YES");
            max=0;
            count=0;
        }
    }
}
