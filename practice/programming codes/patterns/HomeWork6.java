import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ?");
        int number = sc.nextInt();
        int count = 1;
        for (int i = number; i >=1; i--){
            for (int j = 1; j <= i; j++){
                System.out.printf("%4d",count++);
            }
            System.out.println();
        }
        sc.close();
    }
}
