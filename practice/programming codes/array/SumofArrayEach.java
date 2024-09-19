import java.util.Arrays;
import java.util.Scanner;

public class SumofArrayEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number o element you want to insert ? ");
        int number = sc.nextInt();
        int arr[] = new int[number];
        for (int i=0;i<=arr.length-1;i++){
            System.out.println("Enter number ?");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=sum(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
    public static int sum(int a){
        int sum=0;
        while (a!=0) {
            int last = a%10;
            sum+=last;
            a/=10;
        }
        return sum;
    }
}