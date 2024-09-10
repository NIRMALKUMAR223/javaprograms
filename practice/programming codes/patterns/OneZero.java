import java.util.Scanner;

public class OneZero {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ?");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++){
            for (int j = 1; j <= number; j++){
                // if (i%2 == 0){
                //     System.out.print(0+" ");
                // }
                // else{
                //     System.out.print(1+" ");
                // }
                // System.out.print(i%2 +" ");  // row
                System.out.print(j%2 + " "); //column
            }
            System.out.println();
        }
        sc.close();
    }
}
