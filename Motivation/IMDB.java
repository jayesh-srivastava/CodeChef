import java.util.*;
class IMDB
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        int max=0;
        while(testcase-->0)
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            while(n-->0)
            {
                int s=sc.nextInt();
                int r=sc.nextInt();
                if(s<=x) {
                    max= Math.max(max, r);
                }
            }
            System.out.println(max);
            max=0;
        }
    }
}
