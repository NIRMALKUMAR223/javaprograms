import java.util.*;
public class reversenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int last,rev;
        rev=0;
        while (number>0)
        {
            last=number%10;
            rev=(rev*10)+last;
            number/=10;
        }
        System.out.println(rev);
        sc.close();
    }
}
