import java.util.Scanner;
class AmstrongNumber {
    public static int checkPower(int number, int length){
        int result = 1;
        for (int i = 1; i <= length; i++){
            result = result * number;
        }
        return result;
    }
    public static int checkLength(int number){
        int length = 0;
        while (number!=0){
            length+=1;
            number/=10;
        }
        return length;
    }
    public static void checkAmstrongNumber(int number, int length){
        int original = number;
        int result = 0;
        while (number!=0){
            int last = number%10;
            result = result + checkPower(last, length);
            number/=10;
        }
        if (result == original){
            System.out.println("Amstrong Number");
        }
        else{
            System.out.println("Not A Amstrong Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int length = checkLength(number);
        checkAmstrongNumber(number,length);
        sc.close();
    }
}