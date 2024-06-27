import java.util.Scanner;
public class amstrongnumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number , last, cal =0,orig; 
        number=sc.nextInt();
        orig=number;
        while (number>0)
        {
            last=number%10;
            cal= cal + last*last*last;
            number/=10;
        }
        if(cal==orig)
        {
            System.out.println("amstrong");
        }
        else
        {
            System.out.println("not an amstrong");
        }
        sc.close();
    }
}