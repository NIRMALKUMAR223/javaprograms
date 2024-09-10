import java.util.Scanner;

public class Strong {

    public static int  checkFact(int number){
        int fact =1;
        for (int i =1;i<=number;i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void checkStrong(int number){
        int orignal = number;
        int result = 0;
        while (number!=0){
            int last = number %10;
            result = result + checkFact(last);
            number/=10;
        }
        if (orignal == result){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ? ");
        int number = sc.nextInt();
        checkStrong(number);
        sc.close();
    }
}
