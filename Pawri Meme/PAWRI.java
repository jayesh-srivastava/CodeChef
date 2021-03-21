import java.util.*;
class PAWRI
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        while(testcase-->0)
        {
            String s=sc.next();
            String s2="party";
            String s3="pawri";
            System.out.println(s.contains(s2)?s.replaceAll(s2,s3):s);

        }
    }
}
