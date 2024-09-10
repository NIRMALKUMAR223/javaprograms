import java.util.Scanner;

public class RecurtionFact {
    static int fact = 1; 
    public static void fact(int number){
        if (number==0){
            System.out.println("Factorial :"+fact);
        }
        else{
            fact = fact * number;
            number=number-1;
            fact(number);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ? ");
        int number = sc.nextInt();
        fact(number);
        sc.close();
    }
}
