import java.util.*;
class PRICECON
{
    public static int calculate(List<Integer> list,int n)
    {
        int sum=list.stream().mapToInt(i->i).sum();
        for(int x=0;x<list.size();x++)
        {
            if(list.get(x)>n)
            {
                list.set(x,n);
            }
        }
        int sum2=list.stream().mapToInt(i->i).sum();
        return sum-sum2;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int tt=sc.nextInt();
        int result[]=new int[tt];
        for(int x=0;x<tt;x++)
        {
            int size=sc.nextInt();
            int k=sc.nextInt();
            List<Integer> list=new ArrayList<>();
            for(int y=0;y<size;y++)
            {
                list.add(y,sc.nextInt());
            }
            result[x]=calculate(list,k);
        }
        for(int x:result)
        {
            System.out.println(x);
        }
    }
}

