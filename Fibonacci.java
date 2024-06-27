import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int a=-1,c;
        int b=1;
        for (int i=1;i<=number;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
        sc.close();
    }
    
}