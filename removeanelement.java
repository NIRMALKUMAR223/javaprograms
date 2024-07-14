import java.util.Scanner;
public class removeanelement {
    
    static void removeAnElement(int[] arr,int number)
    {
        for (int i=0;i<arr.length;i++)
        {
            if (number==arr[i])
            {
                for (int j=i;j<arr.length;j++)
                {
                    arr[j]=arr[j+1];
                }
            }
        }
        for (int i:arr)
        {
            System.out.print(i+" " );
        }
    }
    
    public static void main(String[] args) {
        int[] arr=new int[5];
        arr[0]=2;
        arr[1]=6;
        arr[2]=8;
        arr[3]=9;
        arr[4]=3;
        Scanner sc=new Scanner(System.in);
        // for (int i=0;i<=10;i++)
        // {
        //     arr[i]=(int)(Math.random()*10);
        // }

        int number=sc.nextInt();
        removeAnElement(arr,number);
        sc.close();
    }
}
