import java.util.Scanner;
class primenumber
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;
        number=sc.nextInt();
        boolean prime;
        for (int i=2;i<=number;i++)
        {
            prime=true;
            for (int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    prime=false;
                    break;
                }
            }
            if (prime)
            {
                System.out.println(i);
            }
        }
    }
}