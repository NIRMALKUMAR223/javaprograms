import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        char ch1,ch2;
        ch1=sc.next().charAt(0);
        ch2=sc.next().charAt(0);
        if (ch1<ch2)
        {
            System.out.println(ch1);
        }        
        else
        {
            System.out.println(ch2);
        }
        sc.close();
    }
}
