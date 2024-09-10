import java.util.Scanner;
public class UniqueNumber {
    public static boolean lastNumberFind(int number, int digit){
        int count = 0;
        while (number!=0){
            int last = number %10 ;
            if (last == digit){
                count++;
            }
            number/=10;
        }
        if (count>1){
            return false;
        }
        return true;
    }
    public static void checkUniqueNumber(int number){
        boolean result = false;
        while (number!=0){
            int last = number %10 ;
            if (lastNumberFind(number, last)){
                result = true;
                number/=10;
            }
            else{
                result = false;
                break;
            }
        }
        if (result){
            System.out.println("Unique");
        }
        else{
            System.out.println("Not Unique");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ?");
        int number = sc.nextInt();
        checkUniqueNumber(number);
        sc.close();
    }
}