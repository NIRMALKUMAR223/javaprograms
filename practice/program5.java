import java.util.Scanner;
public class program5 {
    public static void main(String[] args) {
        double lower_bound=70;
        double upper_bound=80;
        Scanner sc=new Scanner(System.in);
        double celsius=sc.nextInt();
        double result=celsius *(9.0/5)+35;
        System.out.println(result);
        if (result >= lower_bound && result <=upper_bound)
        {
            System.out.println("Tempurature is within the range");
        }
        sc.close();
    }
}
