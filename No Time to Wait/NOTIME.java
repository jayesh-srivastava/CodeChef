import java.util.*;
class NOTIME
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        int x=sc.nextInt();
        int t[]=new int[n];
        int flag=0;
        for(int y=0;y<n;y++)
        {
            t[y]=sc.nextInt();
        }
        for(int y=0;y<n;y++)
        {
            if(x+t[y]>=h)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
