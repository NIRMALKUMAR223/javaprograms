import java.util.Scanner;
class Power{
    
    public static void checkPower(int number,int power){
        int result = 1;
        for (int i = 1; i <= power; i++){
            result = result * number; 
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base value ? ");
        int base = sc.nextInt();
        System.out.println("Enter the power value ? ");
        int power = sc.nextInt();
        checkPower(base, power);
        sc.close();
    }
}