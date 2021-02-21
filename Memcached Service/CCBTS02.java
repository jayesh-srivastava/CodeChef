import java.util.*;
class CCBTS02
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        String result="200";
        while(testcase-->0)
        {
            int n=sc.nextInt();
            String command[]=new String[n];
            for(int x=0;x<n;x++)
            {
                command[x]=sc.next();
            }
            if(command[0].equalsIgnoreCase("stop"))
                result="404";
            else {
                for(int x=0;x<n-1;x++) {
                    if (command[x].equalsIgnoreCase("stop") && command[x + 1].equalsIgnoreCase("stop")) {
                        result = "404";
                    }
                }
            }
            System.out.println(result);
            result="200";
        }
    }
}
