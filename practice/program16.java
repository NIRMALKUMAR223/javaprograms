import java.util.Scanner;
public class program16 {

    static int rev(int number)
    {
        int rev=0;
        while (number!=0)
        {
            int last = number%10;
            rev=(rev*10)+last;
            number/=10;
        }
        return rev;
    }

    static int symmetric(int number,int lengthHalf)
    {
        int i=0;
        int number1=0;
        while (i<lengthHalf)
        {
            int last=number%10;
            number1=(number1*10)+last;
            number/=10;
            i++;
        }
        int reverse=rev(number1);
        int result=number+reverse;
        int square =result*result;
        return square;
    }
    
    static int len(int number)
    {
        int count=0;
        while (number!=0)
        {
            count++;
            number/=10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int original=number;
        int lengthHalf=len(number);
        if (lengthHalf%2==0)
        {            
            int result=symmetric(number, lengthHalf/2);
            if (result==original)
            {
                System.out.println("symmetric");
            }
            else
            {
                System.out.println("not symmetric");
            }
        }
        else
        {
            System.out.println("invalid...!");
        }
        sc.close();
    }
}
