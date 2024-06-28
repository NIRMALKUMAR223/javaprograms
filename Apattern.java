import java.util.*;
public class Apattern {
    
    static void aPattern(int number)
    {
        for (int i=0;i<number;i++)
        {
            for (int j=0;j<number;j++)
            {
                if ((i==0 && j!=0 && j!=number-1) || (j==0 && i!=0) || (j==number-1 && i!=0 ) || i==number/2)
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
        aPattern(number);
        sc.close();
    }
}
