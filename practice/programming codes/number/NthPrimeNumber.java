import java.util.Scanner;

public class NthPrimeNumber {
    public static boolean checkPrime(int number){
        if (number<=1){
            return false;
        }
        for (int i = 2; i<= number/2; i++){
            if (number%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ?");
        int number = sc.nextInt();
        int num = 2,count = 0;
        // int last = 0;
        while (true){
            if (checkPrime(num)){
                count++;
                // last = num;
            }
            if (count == number){
                System.out.println("Nth Prime Number "+ num);
                break;
            }
            num++;            
        }
        // System.out.println("Nth Prime Number "+ last);
        sc.close();
    }
}