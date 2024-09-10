import java.util.Scanner;
public class TwinPrime {
    public static boolean checkPrime(int number){
        if (number <= 1) 
            return false;
        else if (number <= 3)
            return true;
        for (int i = 2; i <= number/2; i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ? ");
        int number = sc.nextInt();
        for (int i = 1; i<=number; i++){
            if (checkPrime(i) && checkPrime(i+2)){
                System.out.println("Twin Prime "+ i+" "+ (i+2));
            }
        }
        sc.close();
        //  checkNumberTwin(number);

    }
        // public static void checkNumberTwin(int number){
    //     int count = 0;
    //     int num = 2;
    //     while (count<number){
    //         if (checkPrime(num) && checkPrime(num+2)){
    //             count++;
    //             System.out.println(count+" Twin Prime : "+(num)+" , "+ (num+2) );
    //             num+=2;
    //         }
    //         else{
    //             num++;
    //         }
    //     }
    // }
}