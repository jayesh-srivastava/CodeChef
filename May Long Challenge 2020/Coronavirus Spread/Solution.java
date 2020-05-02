import java.util.*;
import java.lang.*;
public class Solution
{
    public static int bestcaseevenodd(int ar[])
    {
        Arrays.sort(ar);
        int count=0;
        for(int x=1;x<ar.length;x++)
        {
            if(ar[x] - ar[x-1]<=2)
                count++;
            else
                break;
        }
        return (count+1);
    }
    public static int worstcaseeven(int ar[])
    {
        Arrays.sort(ar);
        int countl=0;
        int countr=0;
        int mid1=ar.length/2;
        int mid2=mid1;
        while(mid1>0)
        {
            if(ar[mid1] - ar[mid1-1]<=2)
                countl++;
            else
                break;
            mid1--;
        }
        while(mid2<(ar.length-1))
        {
            if(ar[mid2+1] - ar[mid2]<=2)
                countr++;
            else
                break;
            mid2++;
        }
        return(countl+countr+1);
    }
    public static int worstcaseodd(int ar[])
    {
        Arrays.sort(ar);
        int countl=0;
        int countr=0;
        int mid1=ar.length/2;
        int mid2=mid1;
        while(mid1>0) {
            if (ar[mid1] - ar[mid1 - 1] <= 2)
                countl++;
            else
                break;
            mid1--;
        }
        while(mid2<(ar.length-1)) {
            if(ar[mid2+1] - ar[mid2]<=2)
                countr++;
            else
                break;
            mid2++;
        }
        return(countl+countr+1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int tt=sc.nextInt();
        int flag=0;
        if(tt>=1 && tt<=2000) {
            int resultb[] = new int[tt];
            int resultw[] = new int[tt];
            for (int x = 0; x < tt; x++) {
                int n = sc.nextInt();
                if(n>=2 && n<=8) {
                    int nar[] = new int[n];
                    for (int y = 0; y < n; y++) {
                        nar[y] = sc.nextInt();
                        if(nar[y]<0 || nar[y]>10)
                            System.exit(-1);
                    }
                    for(int y=0;y<n-1;y++) {
                        if(nar[y]>nar[y+1])
                            System.exit(-1);
                    }
                    if (n % 2 == 0) {
                        resultb[x] = bestcaseevenodd(nar);
                        resultw[x] = worstcaseeven(nar);
                    } else {
                        resultb[x] = bestcaseevenodd(nar);
                        resultw[x] = worstcaseodd(nar);
                    }
                }
                else
                    System.exit(-1);
            }
            for (int x = 0; x < tt; x++) {
                System.out.println(resultb[x] + " " + resultw[x]);
            }
        }
        else
        {
            System.exit(-1);
        }
    }
}

