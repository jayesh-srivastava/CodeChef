import java.util.*;
class CM164364
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        int diff;
        while(testcase-->0)
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            diff=1;
            int ar[]=new int[n];
            for(int y=0;y<n;y++)
            {
                ar[y]=sc.nextInt();
            }
            Arrays.sort(ar);
            for(int y=1;y<n;y++)
            {
                if(ar[y]>ar[y-1])
                    diff++;
            }
            if(diff+x<=n) {
                System.out.println(diff);
            }
            else {
                while (diff + x > n) {
                    diff--;
                }
                System.out.println(diff);
            }
        }
    }
}
