import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ? ");
        int number = sc.nextInt();
        for (int i = 1; i <= number/2; i++){
            if (number%i == 0){
                System.out.print( i+" ");
            }
        }
        System.out.print(number);
        sc.close();
    }
}
