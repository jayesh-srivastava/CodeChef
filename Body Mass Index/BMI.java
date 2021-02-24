import java.util.*;
class BMI
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double bmi=0.0;
        int testcase=sc.nextInt();
        while(testcase-->0) {
            int m = sc.nextInt();
            int h = sc.nextInt();
            bmi = m / (Math.pow(h,2));
            if (bmi <= 18.0)
                System.out.println("1");
            else if (bmi >= 19.0 && bmi <= 24.0)
                System.out.println("2");
            else if (bmi >= 25.0 && bmi <= 29.0)
                System.out.println("3");
            else
                System.out.println("4");

            bmi=0.0;
        }

    }
}
