import java.util.*;
class LKDNGOLF
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        while (testcase-->0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int k = sc.nextInt();
            n += 1;
            if(x % k == 0) {
                System.out.println("YES");
            }
            else if((n - x) % k == 0) {
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }
}
