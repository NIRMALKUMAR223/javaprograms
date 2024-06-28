import java.util.*;
public class lcm {

    static void lcmFinder(int a,int b)
    {
        int largest=a>b?a:b;
        while (true)
        {
            if(largest%a==0 && largest%b==0)
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
    lcmFinder(a, b);
    sc.close();
    }
    
}