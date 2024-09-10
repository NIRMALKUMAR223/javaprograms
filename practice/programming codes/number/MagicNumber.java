import java.util.Scanner;

public class MagicNumber {
    
    public static void checkMagicNumber(int number){
        while (number>9){
            int result = 0;
            while (number != 0 ){
                int last = number%10;
                result = result + last;
                number/=10;
            }
            number = result;
        }
        if (number == 1){
            System.out.println("Magic Number");
        }
        else{
            System.out.println("Not a Magic Number ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ?");
        int number = sc.nextInt();
        checkMagicNumber(number);
        sc.close();
    }
}