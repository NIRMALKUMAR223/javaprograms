import java.util.Scanner;

public class Triangle {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ?");
        int number = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= number; i++){
            for (int j = 1; j <= i; j++){
                System.out.printf("%5d",count);
                count++;

            }
            System.out.println();
        }
        sc.close();
    }
}
