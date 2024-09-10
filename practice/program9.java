public class program9 {
    static boolean prime(int a)
    {
        boolean prime=true;
        for (int i=2;i<=a/2;i++)
        {
            if(a%i==0)
            {
                prime=false;
                break;
            }
        }
        if (prime)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args) {
        boolean b=prime(11);
        System.out.println(b);
    }
}
