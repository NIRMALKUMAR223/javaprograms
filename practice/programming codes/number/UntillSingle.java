import java.util.Scanner;
// public static void untilGet(int number){
//     int result = 0;
//     while (number!=0) { 
//         int last = number%10;
//         result = result + last;
//         number/=10;
//     }
//     number = result; // if (number>0 &&number<10){System.out.println(number);}else{untilGet(number);}}
public class UntillSingle {
    public static void singleDigit(int number){
        while (number>9){
            int result = 0;
            while (number != 0 ){
                int last = number%10;
                result = result + last;
                number/=10;
            }
            number = result;
        }
        System.out.println(number);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ?");
        int number = sc.nextInt();
        singleDigit(number);
        sc.close();
    }
}