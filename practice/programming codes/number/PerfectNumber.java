import java.util.Scanner;

public class PerfectNumber {
    public static void checkPerfect(int number){
        int result = 0;
        for (int i = 1; i <= number/2; i++){
            if (number%i == 0){
                result+=i;
            }
        }
        if (result == number){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not a Perfect Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ? ");
        int number = sc.nextInt();
        checkPerfect(number);   
        sc.close();
    }
}
