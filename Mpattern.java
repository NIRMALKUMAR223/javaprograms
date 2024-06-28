import java.util.*;
public class Mpattern {
    
    static void mPattern(int number)
    {
        for (int i=0;i<number;i++)
        {
            for (int j=0;j<number;j++)
            {
                if ((i==j && i<number/2) || (i+j==number-1 && j>=number/2 )|| j==number-1 || j==0)
                {
                    System.out.print("*"+" ");
                }
                else
                {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        mPattern(number);
        sc.close();
    }
}
