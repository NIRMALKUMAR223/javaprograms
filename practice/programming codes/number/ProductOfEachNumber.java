import java.util.Scanner;

class ProductOfEachNumber{
    public static int countNumber(int number){
        int result=1,last=0;
        while (number>0){
            last = number % 10;
            result *= last;
            number/=10;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ?");
        int number = sc.nextInt();
        System.out.println(countNumber(number) );
        sc.close();
    }
}
