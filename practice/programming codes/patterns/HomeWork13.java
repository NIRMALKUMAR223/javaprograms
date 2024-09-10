import java.util.Scanner;

public class HomeWork13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ?");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++){
            int count =1;
            for (int j = 1; j <= i; j++){
                System.out.print("  ");
            }
            for (int j = i; j<=number; j++){
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
