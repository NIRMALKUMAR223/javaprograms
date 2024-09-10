public class program10 {
    static void gcd(int a,int b)
    {
        for (int i=a/2;i>=1;i--)
        {
            if(a%i==0 && b%i==0)
            {
                System.out.println(i);
                System.out.println(i);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int b=17;
        int a=36;
        if (a>b)
        {
            gcd(a,b);
        }
        else
        {
            gcd(b, a);
        }
 
    }
}
