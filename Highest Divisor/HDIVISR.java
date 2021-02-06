import java.util.*;
class HDIVISR
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int tt=sc.nextInt();
        int big=0;
        for(int x=1;x<=10;x++)
        {
            if(tt%x==0)
                big=x;
        }
        System.out.println(big);
    }
}
