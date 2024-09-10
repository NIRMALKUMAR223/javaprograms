import java.util.Scanner;

public class Tribonoci {
    public static void fibo(int number){
        int number1 = 0;
        int number2 = 1;
        int number3 = 1;
        System.out.print(number1+" "+number2+" "+number3+" ");
        for (int i = 1; i<=number-3;i++){
            int result = number1 + number2 +number3;
            number1 = number2;
            number2 = number3;
            number3 = result;
            System.out.print(result+" ");
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