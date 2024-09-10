import java.util.Scanner;

public class Dec {
    public static void convertOctal(int number){
        String result = "";
        while (number!=0){
            int last  = number%8;
            result = last + result;
            number /=8;
        }
        System.out.println("Octal : "+result);
    }
    public static void convertBinary(int number){
        String result = "";
        while (number!=0){
            int last  = number%2;
            result = last + result;
            number /=2;
        }
        System.out.println("Binary : "+result);
    }
    public static void convertHexadec(int number){
        String result = "";
        while (number!=0){
            int last  = number%16;
            result = last + result;
            number /=16;
        }
        System.out.println("Hexadecimal : "+result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ? ");
        int number = sc.nextInt();
        convertHexadec(number);
        sc.close();
    }
}
