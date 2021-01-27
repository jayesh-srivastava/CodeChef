import java.util.Scanner;
class CRDGAME3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int tt=sc.nextInt();
        while(tt-->0)
        {
            int c=sc.nextInt();
            int r=sc.nextInt();
            if(c<=9 && r<=9)
            {
                System.out.println("1 1");
            }
            else if(c==r)
            {
                System.out.println("1 1");
            }
            else
            {
                int min=Math.min(c,r);
                double round=min/9.0;
                int round2=(int)Math.ceil(round);
                if(min==c)
                    System.out.println("0 "+round2);
                else
                    System.out.println("1 "+round2);
            }
        }
    }
}
