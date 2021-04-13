import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;
class BOLT
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        double result;
        DecimalFormat ob=new DecimalFormat("##.##");
        while(testcase-->0)
        {
            double k1=sc.nextDouble();
            double k2=sc.nextDouble();
            double k3=sc.nextDouble();
            double v=sc.nextDouble();
            result = (100.0)/(k1*k2*k3*v);
            result = Double.parseDouble(ob.format(result));
            System.out.println((result<9.58)?"Yes":"No");
        }
    }
}
