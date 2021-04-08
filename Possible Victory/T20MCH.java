import java.util.*;
class T20MCH
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int o=sc.nextInt();
        int c=sc.nextInt();
        int result=(((20-o)*6)*6)+c;
        System.out.println((result>r)?"Yes":"No");
    }
}
