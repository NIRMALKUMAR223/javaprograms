import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 ?");
        int number1 = sc.nextInt();
        System.out.println("Enter the number2 ?");
        int number2 = sc.nextInt();
        int largest = number1 > number2 ? number1 : number2;
        for (int i = 1; i <= largest/2; i++){
            if (number1 % i==0 && number2%i==0){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
