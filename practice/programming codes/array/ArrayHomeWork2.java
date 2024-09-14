import java.util.Scanner;
public class ArrayHomeWork2 {
    public static boolean arrayCheckPrime(int number){
        if (number<=1){
            return false;
        }
        for (int i = 2;i<=number/2;i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of element you want to insert ? ");
        int number = sc.nextInt();
        int arr[] = new int[number];
        for (int i=1;i<number;i++){
            System.out.println("Enter number ?");
            arr[i]=sc.nextInt();
        }
        for (int iter:arr){
            if(arrayCheckPrime(iter)){
                System.out.print(iter+" ");
            }
        }
        sc.close();
    }
}
