import java.util.Arrays;
import java.util.Scanner;
public class Reverse{        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number o element you want to insert ? ");
        int number = sc.nextInt();
        int arr[] = new int[number];
        for (int i=0;i<arr.length;i++){
            System.out.println("Enter number ?");
            arr[i]=sc.nextInt();
        }
        int i=0,j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
