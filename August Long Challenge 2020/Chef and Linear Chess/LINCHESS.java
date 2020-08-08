import java.util.*;
public class Linchess
{
    public static void  main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int tt=sc.nextInt();
        int min=0;
        while(tt-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int ar[]=new int[n];
            for(int x=0;x<n;x++)
            {
                ar[x]=sc.nextInt();
                if(k%ar[x]==0)
                {
                    if(ar[x]>min)
                        min=ar[x];
                }
            }
            if(min==0)
            {
                System.out.println(-1);
            }
            else
                System.out.println(min);
            min=0;
        }
    }
}

