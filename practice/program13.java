

import java.util.Scanner;
public class program13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int largest=number%10;
        number/=10;
        while (number!=0)
        {
            int check=number%10;
            if (check>largest)
            {
                largest=check;
            }
            number/=10;
        }
        System.out.println(largest);
        sc.close();
    }
}
