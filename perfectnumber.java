import java.util.*;
public class perfectnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int count=0;
        for (int i=1;i<=number/2;i++)
        {
            if (number%i==0)
            {
                count+=i;
            }

        }
        if (count==number)
        {
            System.out.println("Perfect number");
        }
        else
        {
            System.out.println("Not A Perfect number");
        }
        sc.close();
    }
}
