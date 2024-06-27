import java.util.*;
public class gcd {
    static void commonFactor(int a,int b)
    {
        for (int i=a/2;i>=1;i--)
        {
            if(a%i==0 && b%i==0)
            {
                System.out.println(i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if (a>b)
        {
            commonFactor(a, b);
        }
        else
        {
            commonFactor(b, a);
        }
        sc.close();
    }
}
