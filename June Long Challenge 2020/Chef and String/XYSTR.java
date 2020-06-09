import java.util.*;
class XYSTR
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int tt=sc.nextInt();
        int result[]=new int[tt];
        for(int x=0;x<tt;x++)
        {
            String s=sc.next();
            int count=0;
            int y=0;
            while(y<(s.length()-1))
            {
                char ch=s.charAt(y);
                char ch1=s.charAt(y+1);
                if(ch!=ch1)
                {
                    count++;
                    y=y+2;
                }
                else
                {
                    y++;
                }
                result[x]=count;
            }
        }
        for(int x:result)
        {
            System.out.println(x);
        }
    }
}

