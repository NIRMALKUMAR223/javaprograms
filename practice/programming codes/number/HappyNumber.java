import java.util.Scanner;
public class HappyNumber {
    public static int checkPower(int number){
        return number * number;
    }
    public static void checkHappyNumber(int number){
        while (number>9){
            int result = 0;
            while (number != 0 ){
                int last = number%10;
                result = result + checkPower(last); // (last * last) no need to take method here...
                number/=10;
            }
            number = result;
        }
        if (number == 1 || number == 7){
            System.out.println("Happy Number ");
        }
        else{
            System.out.println("Not a Happy Number ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ?");
        int number = sc.nextInt();
        checkHappyNumber(number);
        sc.close();
    }
}