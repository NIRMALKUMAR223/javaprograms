import java.util.Scanner;

public class ValidDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        int day = sc.nextInt();
        System.out.println("Enter the month");
        int month = sc.nextInt();
        System.out.println("Enter the year");
        int year = sc.nextInt();
        if (day < 1 || day >31 || month<1 || month > 12 || year < 1){
            System.out.println("Invalid date");
        }
        else if ((month == 4 || month == 6 || month == 9 || month == 11) && day >30){
            System.out.println("Invalid date");
        }
        else if (!(year % 4 == 0 && year % 100 != 0 || year % 400 ==0) && day >28){
            System.out.println("Invalid date");
        }
        else if ((year % 4 == 0 && year % 100 != 0 || year % 400 ==0) && day >29){
            System.out.println("Invalid date");
        }
        else{
            System.out.println("Valid date");
        }
        sc.close();
    }
}
