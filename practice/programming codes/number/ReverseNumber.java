import java.util.Scanner;

class ReverseNumber{
    public static int countNumber(int number){
        int last=0,result=0;
        while (number>0){
            last = number % 10;
            result = result * 10 + last;
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