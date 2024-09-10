import java.util.Scanner;

public class HomeWork11 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ?");
        int number = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= number; i++){
            for (int j = number; j >= i; j--){
                System.out.print("  ");
            }
            for (int j = 1; j<=i; j++){
                System.out.printf("%3d",count++);
            }
            System.out.println();
        }
        sc.close();
    }
}
