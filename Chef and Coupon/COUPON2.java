import java.util.*;
class COUPON2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int tt=sc.nextInt();
        int add_c=0,add_d=0,add_wc=0,add_whc=0;
        while(tt-->0)
        {
            int d=sc.nextInt();
            int c=sc.nextInt();
            for(int z=1;z<=3;z++)
            {
                int x=sc.nextInt();
                add_d+=x;
            }
            for(int z=1;z<=3;z++)
            {
                int y=sc.nextInt();
                add_c+=y;
            }
            if(add_d>=150 && add_c>=150)
            {
                add_wc=add_c+add_d+c;
            }
            else if(add_d<150 && add_c<150)
            {
                add_wc=add_c+add_d+c+d+d;
            }
            else
            {
                add_wc=add_c+add_d+c+d;
            }
            add_whc=add_c+add_d+d+d;
            if(add_wc<add_whc)
                System.out.println("YES");
            else
                System.out.println("NO");
            add_c=0;
            add_d=0;
            add_whc=0;
            add_wc=0;
        }
    }
}
