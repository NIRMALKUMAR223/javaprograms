import java.util.Scanner;

public class NearestPrime {
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
        int pre = --number;
        int nex = ++number;
        while (true){
            if (checkPrime(number)){
                System.out.println("Nereast Prime "+number);
                break;
            }
            else if (checkPrime(pre)){
                System.out.println("Nereast Prime "+pre);
                break;
            }
            else if (checkPrime(nex)){
                System.out.println("Nereast Prime "+nex);
                break;
            }         
            pre--;
            nex++;
        }
        sc.close();
    }
}