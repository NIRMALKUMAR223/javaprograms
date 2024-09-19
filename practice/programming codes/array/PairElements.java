// import java.util.Scanner;

public class PairElements {
        public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the total number o element you want to insert ? ");
        // int number = sc.nextInt();
        // int arr[] = new int[number];
        // for (int i=0;i<=arr.length-1;i++){
        //     System.out.println("Enter number ?");
        //     arr[i]=sc.nextInt();
        // }
        // sc.close();
            int arr[] = {1,2,3,4,5,3,0,6,-1,7,};
            int n = 6;
            for (int i=0;i<=arr.length-1;i++){
                for (int j =i+1;j<=arr.length-1;j++){
                    if (arr[i]+arr[j]==n){
                        System.out.println(arr[i]+" "+arr[j]);
                    }
                }
            }
    }
}
