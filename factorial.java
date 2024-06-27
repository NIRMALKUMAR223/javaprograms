import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fact=1;
        int number=sc.nextInt();
        for (int i=1;i<=number;i++) //i=1 1<=5 
        {
            fact*=i;
        }
        System.out.println(fact);
        sc.close();
    }
}
