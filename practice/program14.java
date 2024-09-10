import java.util.Scanner;
public class program14 {
    static void zig(int number1,int number2)
    {
        int revNumber1=0;
        int end=0;
        while (number1!=0)
        {
            int last =number1%10;
            revNumber1=(revNumber1*10)+last;
            number1/=10;
        }
        while (revNumber1!=0)
        {
            int  last1=revNumber1%10;
            end=(end*10)+last1;
            revNumber1/=10;
            int last2=number2%10;
            end=(end*10)+last2;
            number2/=10;
        }
        System.out.println(end);
    }
    static int check(int number)
    {
        int countOfNumber=0;
        while (number!=0)
        {
            number%=10;
            countOfNumber++;
            number/=10;
        }
        return countOfNumber;
    }
    static boolean length(int number1,int number2)
    {
        if (check(number1)==check(number2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        boolean status =length(number1, number2);
        if (status)
        {
            zig(number1,number2);
        }
        else
        {
            System.out.println("Invalid");
        }
        sc.close();
    }
}