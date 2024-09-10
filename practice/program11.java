import java.util.*;
public class program11 {

    static void lcmFinder(int a,int b,int c)
    {
        int largest=a>b && a>c?a:b>c?b:c;
        while (true)
        {
            if(largest%a==0 && largest%b==0 && largest%a==0)
            {
                System.out.println(largest);
                break;
            }
            largest++;
        }
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    lcmFinder(a, b, c);
    sc.close();
    }
    
}