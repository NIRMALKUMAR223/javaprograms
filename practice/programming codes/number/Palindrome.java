import java.util.Scanner;

public class Palindrome {
    public static void checkPalindrome(int number){
        int original = number;
        int result = 0;
        while (number>0){
            int last = number % 10;
            result = result * 10 + last;
            number/=10;
        }
        if (result == original){
            System.out.println("The given number is palindrome !");
        }
        else{
            System.out.println("The given number is not a palindrome !");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ? ");
        int number = sc.nextInt();
        checkPalindrome(number);
        sc.close();
    }
}