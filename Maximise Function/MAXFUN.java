import java.util.*;
class MAXFUN
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        long result=0;
        while(testcases-->0)
        {
            int n=sc.nextInt();
            long ar[]=new long[n];
            for(int x=0;x<n;x++)
            {
                ar[x]=sc.nextLong();
            }
            Arrays.sort(ar);
            result=Math.abs((ar[0]-ar[1]))+Math.abs((ar[1]-ar[n-1]))+Math.abs((ar[0]-ar[n-1]));
            System.out.println(result);
        }

    }
}
