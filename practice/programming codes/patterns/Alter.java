import java.util.Scanner;

public class Alter {
            public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ?");
        int number = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= number; i++){
            for (int j = 1; j <= number; j++){
                System.out.print(count%2 + " ");
                count++;
            }
            System.out.println();
        }
        sc.close();
    }
}
