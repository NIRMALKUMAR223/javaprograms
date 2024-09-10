import java.util.Scanner;

public class Fibonoci {
    public static void fibo(int number){
        int number1 = -1;
        int number2 = 1;

        for (int i = 1; i<=number;i++){
            int result = number1 + number2;
            number1 = number2;
            number2 = result;
            System.out.println(result);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ?");
        int number = sc.nextInt();
        fibo(number);
        sc.close();
    }
}
