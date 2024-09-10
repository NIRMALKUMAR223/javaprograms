import java.util.Scanner;
public class Factorial {
    public static void findFactorial(int number){
        long result = 1;
        for (int i = 1; i <= number; i++){
            result*=i;
        }
        System.out.println("The Factorial is "+ result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ? ");
        int number = sc.nextInt();
        findFactorial(number);
        sc.close();
    }
}