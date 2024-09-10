import java.util.Scanner;
class PrimeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ?");
        int number = sc.nextInt();
        for (int i =2 ; i<=number ; i++){
            int count = 0;
            for (int j =2; j < i;j++ ){
                if ( i%j == 0){
                    count++;
                    break;
                }
            }
            if (count==0){
                System.out.println("Prime "+i);
            }
        }
        sc.close();
    }
}