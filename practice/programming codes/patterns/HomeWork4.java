import java.util.Scanner;

public class HomeWork4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ?");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++){
            int count = i;
            for (int j = 1; j <= number; j++){
                System.out.print(count +" ");
                count++;
            }
            System.out.println();
        }
        sc.close();
    }
}
