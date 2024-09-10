import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        if (a>b && a>b && a>c && a>d)
        {
            System.out.println(a);
        }
        else if (b>c && b>d)
        {
            System.out.println(b);
        }
        else if (c>d)
        {
            System.out.println(c);
        }
        else
        {
            System.out.println(d);
        }
        sc.close();
    }
}
