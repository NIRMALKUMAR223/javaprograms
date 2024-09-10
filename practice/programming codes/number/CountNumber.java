import java.util.Scanner;

class CountNumber{
    public static int countNumber(int number){
        int count=0;
        if (number == 0){
            return 1;
        }
        while (number>0){
            count+=1;
            number/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ?");
        int number = sc.nextInt();
        System.out.println(countNumber(number) );
        sc.close();
    }
}